package com.controller;

import java.io.IOException;
import java.rmi.ServerException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Admin;
import com.model.Policy;
import com.model.Ticket;
import com.model.User;
import com.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	AdminService aserv;
	
	private int value;
	
	
	@RequestMapping("/AdminLogin")
	public ModelAndView adminLogin() {
		ModelAndView mv = new ModelAndView("AdminLogin");
		return mv;
	}
	
	@RequestMapping(value="/adminloginProcess")
	  public ModelAndView adminloginProcess(HttpServletRequest request) throws ServerException,IOException, ServletException {
		  ModelAndView mv = null;
		  String user=request.getParameter("username");
		  String pass=request.getParameter("password");
		  Admin a=new Admin();
		  a.setUsername(user);
		  a.setPassword(pass);
		  if(a.getUsername().equals("vijay") && a.getPassword().equals("123456")) {
			  List<User> lst = new ArrayList<User>();
			  List<Policy> l = new ArrayList<Policy>();
			  List<Ticket> t = new ArrayList<Ticket>();
				lst = aserv.getAllUser();
				request.setAttribute("usrList",lst);
				t = aserv.getAllTicket();
				request.setAttribute("tickets",t);
				l = aserv.getAllPolicy();
				request.setAttribute("PolicyList",l);
			  mv = new ModelAndView("AdminPanel");
		  }else {
			  mv = new ModelAndView("AdminLogin");
			  mv.addObject("message", "Username or Password is wrong!!");
		  }
		  return mv;
	  }
	 @RequestMapping(value="/deleteusr/{username}")  
	    public ModelAndView deleteUser(@PathVariable String username){  
	        aserv.deleteUser(username);  
	        return new ModelAndView("deleted");  
	    }
	 @RequestMapping(value="deletepolicy/{policyId}")  
	    public ModelAndView deletePolicy(@PathVariable int policyId){  
	        aserv.deletePolicy(policyId);  
	        return new ModelAndView("deleted");  
	    }  
	 @RequestMapping(value="/deletetickets/{ticketNo}")  
	    public ModelAndView deleteTicket(@PathVariable int ticketNo){  
	        aserv.deletetickets(ticketNo); 
	        return new ModelAndView("deleted");  
	    }  
	 @RequestMapping(value="approvetickets/{ticketNo}")
	 public ModelAndView approveTicket(@PathVariable int ticketNo) {
		 Ticket p = new Ticket();
		 p.setticketNo(ticketNo);
		 value=p.getticketNo();	 
		List<Ticket> lst= aserv.getTicketByNo(ticketNo);
		int status = lst.get(0).getStatus();
		aserv.approveTicket(status, value);
		 return new ModelAndView("Approved");
	 }
	 @RequestMapping(value="claimAmount/{claimAmount},{policyId}")
	 public ModelAndView Claim(@PathVariable float claimAmount,@PathVariable int policyId,HttpServletRequest request) {
		 HttpSession session = request.getSession();
		 session.setAttribute("amount", claimAmount);
		 session.setAttribute("id", policyId);
		 System.out.println("amount:"+claimAmount+";id in controller:"+policyId);
		 return new ModelAndView("CLAIM");
	 }
	 
	 @RequestMapping(value = "/deduct")
	 public ModelAndView Claim(HttpServletRequest request) {
		 ModelAndView mv= new ModelAndView();
		 HttpSession session=request.getSession(false);
		 float amt = (Float) session.getAttribute("amount");
		 int id = (Integer) session.getAttribute("id");
		 float amount=Float.parseFloat(request.getParameter("claimamount"));
		 if(amount>amt) {
			 mv.addObject("previous", amt);
			 mv.addObject("original", amount);
			 mv.setViewName("Invalid");
		 }
		 else {
			 aserv.getclaim(amt, amount,id);
			 mv.setViewName("valid");
		 }
		
		return mv;
	 }
}
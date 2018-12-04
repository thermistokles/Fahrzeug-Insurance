package com.insurance.controller;

import com.insurance.model.Ticket;
import com.insurance.service.ClaimService;

import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClaimController{
	 @Autowired  
	   ClaimService claimService;
	@RequestMapping("/claim")
	public ModelAndView ticket(HttpServletRequest request) {
		String username = request.getParameter("username");       //Accepting username
		
		//Generating a random 6 digit number for ticket
		Random rnd = new Random();                     
		int n = 100000 + rnd.nextInt(900000);
		Ticket t=new Ticket();
		t.setticketNo(n);
		
		//Saving ticket
		claimService.saveTicket(t, username);
		ModelAndView mv=new ModelAndView("Token");
		mv.addObject("ticket", n);
		return mv;
	}
}
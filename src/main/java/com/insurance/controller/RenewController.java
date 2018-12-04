package com.insurance.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.insurance.model.Policy;
import com.insurance.model.Ticket;
import com.insurance.service.RenewService;

@Controller
public class RenewController {
	
	@Autowired
	RenewService renewService;
	
	int pid;
	
	@RequestMapping(value="/renew/{id}")  
	//fetching corresponding id
    public ModelAndView renew(@PathVariable int id) {  
        List<Policy> policy=renewService.getPolicyDetails(id);  
        pid = id;
       ModelAndView mav = new ModelAndView("/SelectPolicyType");
        mav.addObject("policy", policy);  
        return mav;
    } 
	
	@RequestMapping(value = "/renewProcess", method = RequestMethod.POST)
    public ModelAndView renewProcess(@ModelAttribute("policy") Policy policy, HttpServletRequest request){  
        //List<Policy> policy=renewService.getPolicyDetails(id); 
       ModelAndView mav = new ModelAndView("/Payment");
       String policyType = request.getParameter("policyType");
       TicketGenerator ticket = new TicketGenerator();
       int ticketNo = ticket.getTicket();
       Ticket t = new Ticket();
       t.setticketNo(ticketNo);
       renewService.saveTicket(t, pid);
       mav.addObject("pid", pid);
        mav.addObject("ticketNo", ticketNo);
        mav.addObject("policyType", policyType);
        return mav;
        }

}

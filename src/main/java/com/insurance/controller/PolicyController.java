package com.insurance.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.insurance.dao.PolicyDao;
import com.insurance.model.Policy;
import com.insurance.model.Ticket;
import com.insurance.service.RenewService;

@Controller
public class PolicyController {
	@Autowired
	PolicyDao policyDao;
	
	@Autowired
	RenewService renewService;
	
	@RequestMapping("/policyProcess")
	public ModelAndView addPolicy(HttpServletRequest request, HttpServletResponse response,@ModelAttribute Policy policy) {
		
		ModelAndView mv = new ModelAndView("/Payment");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate localDate = LocalDate.now();
		String start_date=dtf.format(localDate);
		
		
		LocalDate localdate2 = LocalDate.now().plusYears(1);
		
		String end_date=dtf.format(localdate2);
		
		//policy.setPolicyType(request.getParameter("policy_type"));
		
		String policy_type=request.getParameter("policy_type");
		
		
		policy.setPolicyType(policy_type);
		policy.setUserId(Integer.parseInt(request.getParameter("user_id")));
		policy.setUserVehicleRegNo(request.getParameter("reg_no"));		
		policy.setStartDate(start_date);
		policy.setEndDate(end_date);		
		policy.setClaimAmount(Float.parseFloat(request.getParameter("idv")));
		policy.setPolicyStatus(0);
		//System.out.println("premium in policy con"+premium);
		
		policyDao.addPolicy(policy);
		
		policy.setPolicyId(policyDao.getPid(policy.getUserId()));
	       TicketGenerator ticket = new TicketGenerator();
	       int ticketNo = ticket.getTicket();
	       Ticket t = new Ticket();
	       t.setticketNo(ticketNo);
	       renewService.saveTicket(t, policy.getPolicyId());
	       mv.addObject("pid", policy.getPolicyId());
	       mv.addObject("ticketNo", ticketNo);
	       mv.addObject("policyType", policy.getPolicyType());		
		
		return mv;
	}
	
}

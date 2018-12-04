package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.model.MD5;
import com.service.PasswordService;


@Controller
public class PasswordController {
	
	@Autowired	
	PasswordService passerv;
	
	@RequestMapping("/ForgotPass")
	public ModelAndView getData(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("ForgotPass");
		return mv;	
	}

	@RequestMapping("/ForgotPassProcess")
	public ModelAndView verify(HttpServletRequest request) {
		boolean i=false;
		ModelAndView mv=new ModelAndView("ResetPass");

		String username=request.getParameter("username");
		String email=request.getParameter("email");
		i=passerv.getPass(username,email);
		
		if (i==false) {
		mv=new ModelAndView("ForgotPass");
		}	
		mv.addObject("username", username);
			
		return mv;		
	}
	
	@RequestMapping("/ResetPass")
	public ModelAndView reset(HttpServletRequest request) {
		String username=request.getParameter("username");
		String password=MD5.getMd5(request.getParameter("password"));
		passerv.setPass(username,password);
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}
	
	
	
}

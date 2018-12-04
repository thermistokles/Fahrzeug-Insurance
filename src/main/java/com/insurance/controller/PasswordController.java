package com.insurance.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.insurance.model.Login;
import com.insurance.model.MD5;
import com.insurance.service.PasswordService;


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
	public ModelAndView verify(HttpServletRequest request, HttpServletResponse response) {
		int i=0;
		ModelAndView mv=null;

		String username=request.getParameter("username");
		String email=request.getParameter("email");
		
		
		i=passerv.getPass(username,email);
		
		if (i==0) {
		mv=new ModelAndView("login");
		}
		else {
			mv=new ModelAndView("ResetPass");
			mv.addObject("username",username);
			
		}
			
		return mv;		
	}
	
	@RequestMapping("/ResetPass")
	public ModelAndView reset(HttpServletRequest request, HttpServletResponse response,Login login) {
		
		ModelAndView mv=null;
		String username=request.getParameter("username");
		login.setUsername(username);
		
		String password=request.getParameter("password");
		login.setPassword(password);
		

		int i=passerv.setPass(login);
		if(i>0) {
			mv=new ModelAndView("login");
			mv.addObject("msg", "Password Successfully Changed");
		}
		else {
			mv=new ModelAndView("ForgotPass");
			mv.addObject("msg", "Password Successfully Changed");
		}
		
		return mv;
	}
	
	
	
}
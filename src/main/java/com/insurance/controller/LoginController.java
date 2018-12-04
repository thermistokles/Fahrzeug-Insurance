package com.insurance.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.insurance.model.Login;
import com.insurance.model.Policy;
import com.insurance.model.User;
import com.insurance.service.PolicyService;
import com.insurance.service.UserService;

@Controller
public class LoginController {
  @Autowired
  UserService userService;
  
  @Autowired
  PolicyService policyService;
  
  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("login");
    mav.addObject("login", new Login());
    return mav;
  }
  
  @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
  @ModelAttribute("login") Login login) {

	  
    ModelAndView mav;
		
		User user = userService.validateUser(login);
		List<Policy> policy = policyService.show(login.getUsername());
		
		if (null != user) {
			//mav.setViewName("welcome");
			mav = new ModelAndView("userpage");
			mav.addObject("user",user.getUsername());
			mav.addObject("policies", policy);
	   
			} else {
			mav = new ModelAndView("login");
			mav.addObject("message", "Username or Password is wrong! Try again");
			}
    return mav;
  }
}
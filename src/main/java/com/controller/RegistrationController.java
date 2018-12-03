package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;
import com.model.UserVehicle;
import com.service.EstimateService;
import com.service.UserService;



		  @Controller
		  public class RegistrationController {
		  	@Autowired
		  	  public UserService userService;
		  	
		  	@Autowired
		  	public EstimateService es;
		  	
		  	  @RequestMapping(value = "/register", method = RequestMethod.GET)
		  	  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
		  	    ModelAndView mav = new ModelAndView("register");
		  	   
		  	    mav.addObject("user", new User());
		  	    return mav;
		  	  }
		  	  
		  	  @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
		  	  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("user") User user, @ModelAttribute("uv") UserVehicle uv) {
		  		  
		  		  userService.register(user);
		  	  
		  	  
		  	  //Send user_id to VehicleRegister.jsp
		  	  
		  	  /*ModelAndView mv=new ModelAndView("VehicleForm");
		  	  mv.addObject("uid", user.getUid());*/
		  	  
		  		//get user_id from VehicleForm.jsp
		  		  		int uid = userService.getUid(user.getUsername());
		  			 
		  		  		//delete---uid display
		  			 System.out.println(uid);
		  			 
		  		  	uv.setUser_id(uid);		
		  		  	ModelAndView mv = new ModelAndView("VehicleRegister");
		  	  		
		  	        List<String> model_list=es.getModel(); 
		  	        List<String> company_list=es.getCompany();
		  	        mv.addObject("model_list",model_list);
		  	        mv.addObject("company_list",company_list);
		  	        mv.addObject("user",uv.getUser_id());
		  	      
		  	        return mv;  
		  	  }
		  }



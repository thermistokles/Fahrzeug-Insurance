package com.insurance.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.insurance.model.UserVehicle;
import com.insurance.service.EstimateService;
import com.insurance.service.VehicleRegisterService;

@Controller
public class VehicleRegisterController {
	
	@Autowired
	public VehicleRegisterService vrs;
	
	@Autowired
	public EstimateService eserv;
	 @RequestMapping("/VehicleRegister")
		public ModelAndView est(@ModelAttribute UserVehicle v,HttpServletRequest request) {
			
			System.out.println("date in vehicle register:"+v.getPurchase_date());
			int uid=Integer.parseInt(request.getParameter("user_id"));
			v.setUser_vehicle_engine(Integer.parseInt(eserv.getEngine(v)));
			
			String engine=eserv.getEngine(v);
			
			v.setUser_vehicle_engine(Integer.parseInt(engine));
			String policy =request.getParameter("policy");
			
			PremiumCalc pc=new PremiumCalc();
			float p[]=pc.calc(eserv, v, policy);

					
	
					v.setPurchase_date(v.getPurchase_date());
					v.setUser_id(uid);
					v.setUser_vehicle_chasis_no(Integer.parseInt(request.getParameter("user_vehicle_chasis_no")));
					v.setUser_vehicle_engine_no(Integer.parseInt(request.getParameter("user_vehicle_engine_no")));
					v.setUser_vehicle_company(v.getUser_vehicle_company());
					v.setUser_vehicle_engine(v.getUser_vehicle_engine());
					
					v.setUser_vehicle_model(v.getUser_vehicle_model());
					v.setUser_vehicle_reg_no(request.getParameter("user_vehicle_reg_no"));
					v.setUser_vehicle_type(v.getUser_vehicle_type());				
					
					//Store Vehicle Details in DataBase
					vrs.registerVehicle(v);
					ModelAndView mv=new ModelAndView("PolicyRegister");
					mv.addObject("premium",p[0]);
					mv.addObject("idv", p[1]);
					mv.addObject("user_id",v.getUser_id());							
					mv.addObject("policy_type", policy);
					mv.addObject("reg_no", v.getUser_vehicle_reg_no());	
					
					
					return mv;
			
		}
	 
	
	 
}

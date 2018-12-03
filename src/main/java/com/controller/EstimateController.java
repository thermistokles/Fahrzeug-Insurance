package com.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.model.UserVehicle;
import com.service.EstimateService;
import javax.servlet.http.HttpServlet;

@SuppressWarnings("serial")
@Controller
public class EstimateController extends HttpServlet {


	@Autowired
	EstimateService eserv;
	
	@RequestMapping("/calculate_premium_estimate")
	public ModelAndView calc() {
		
			
		//Getting vehicle information and passing it to the vehicle info page
  		ModelAndView mv = new ModelAndView("vehicleinfo");
        List<String> model_list=eserv.getModel(); 
        List<String> company_list=eserv.getCompany();
        mv.addObject("model_list",model_list);
        mv.addObject("company_list",company_list);
        return mv;  
		    } 
	
	
	@RequestMapping("/vehicleinfo")
	public ModelAndView est(@ModelAttribute UserVehicle uv,HttpServletRequest request) {
		String engine=eserv.getEngine(uv);
		
		//Getting policy information, calculating premium and passing it to estimate display page
		uv.setUser_vehicle_engine(Integer.parseInt(engine));
		String policy =request.getParameter("policy");
		PremiumCalc pc=new PremiumCalc();
		float p[]=pc.calc(eserv, uv, policy);
		return new ModelAndView("estimate_display","premium",p[0]);
		
	}
}
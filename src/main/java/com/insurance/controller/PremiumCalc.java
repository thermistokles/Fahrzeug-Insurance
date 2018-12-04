package com.insurance.controller;

import com.insurance.model.UserVehicle;
import com.insurance.service.EstimateService;

public class PremiumCalc {

	public float[] calc(EstimateService eserv ,UserVehicle uv,String policy) {
		
		float p[]=new float[2];

		float age=eserv.getAge(uv.getPurchase_date());
	
		 float premium=0;
		
				//calling tp_rate method
				String tp_premium=eserv.tp_rates(Integer.toString(uv.getUser_vehicle_engine()));
								
				//if policy is third party
				if(policy.equals("3PL")) {
					//3rd party premium estimate 
					
					int tp1=Integer.parseInt(tp_premium);
					float tp2=0.55f*tp1;
					premium=tp2;
					p[0]=premium;
					
					//calculate dep_value--
					//get dep_rate
					float dep=(float)(eserv.dep_value(age));
							
					
					//get selling price
					int sp=eserv.get_sp(uv.getUser_vehicle_model());
					
					
					//calculate idv
					
					float d1=dep/100.00f; System.out.println("d1-"+d1);
					float s1=d1*sp; System.out.println("s1-"+s1);
					float i1=sp-s1; System.out.println("i1-"+i1);
					
					float idv=(sp-(sp*(dep/100.00f)));
					p[1]=idv;
					
					
				}
		
		//if comprehensive policy
		else if(policy.equals("COMP")) {
			
				//calculate dep_value--
			//get dep_rate
			float dep=(float)(eserv.dep_value(age));
								
			//get selling price
			int sp=eserv.get_sp(uv.getUser_vehicle_model());
			
			
			//calculate idv
			
			float d1=dep/100.00f; System.out.println("d1-"+d1);
			float s1=d1*sp; System.out.println("s1-"+s1);
			float i1=sp-s1; System.out.println("i1-"+i1);
			
			float idv=(sp-(sp*(dep/100.00f)));
			p[1]=idv;
			
			//od calculate
			int zone =uv.getUser_zone();			
			
			float od_rate=eserv.get_od(Integer.toString(uv.getUser_vehicle_engine()),zone,age);
			
			float od=idv*(od_rate/100.00f);
			
			int comp_tp=Integer.parseInt(tp_premium);
			
			
			if(uv.getUser_vehicle_type().equals("2W")) {
				int tp1=comp_tp;
				float tp2=0.55f*tp1;
				od=od*0.55f;
				
				
				
				float od_premium=tp2+od+50;
				//comprehensive premium estimate display page
				premium=od_premium;
				p[0]=premium;
			}
			else if(uv.getUser_vehicle_type().equals("4W"))
			{
				int tp1=comp_tp;
				float tp2=0.55f*tp1;
				od=od*0.55f;
				float od_premium=tp2+od+100;
				//comprehensive premium estimate display page
				premium=od_premium;
				p[0]=premium;
				
				}			
		
		}
		return p;
	}
}

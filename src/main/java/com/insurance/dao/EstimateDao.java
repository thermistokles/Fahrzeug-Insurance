package com.insurance.dao;

import java.util.List;

import com.insurance.model.UserVehicle;



public interface EstimateDao {
			
	String getEngine(UserVehicle uv);
	
	float getAge(String dop);
	
	String tp_rates(String engine);
	
	int dep_value(float age);
	
	int get_sp(String model);
	
	float get_od(String engine,int state,float age);
	
	List<String> getModel();
	
	List<String> getCompany();
		

}

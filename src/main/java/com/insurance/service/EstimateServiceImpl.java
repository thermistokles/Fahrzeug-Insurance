package com.insurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.dao.EstimateDao;
import com.insurance.model.UserVehicle;

@Service
public class EstimateServiceImpl implements EstimateService {
	@Autowired
	public EstimateDao idao;
	
	public float getAge(String dop) {
		System.out.println("in service impl");
		return idao.getAge(dop);
	}
	
	public String tp_rates(String engine) {
		return idao.tp_rates(engine);
		
	}
	
	public String getEngine(UserVehicle uv) {
		return idao.getEngine(uv);
	}
	
	public int dep_value(float age) {
		return idao.dep_value(age);
	}
	
	public int get_sp(String model) {
		return idao.get_sp(model);
	}
	
	public float get_od(String engine,int state,float age) {
		return idao.get_od(engine, state, age);
	}
	
	public List<String> getModel(){
		return idao.getModel();
	}
	
	public List<String> getCompany(){
		return idao.getCompany();
	}
	
}

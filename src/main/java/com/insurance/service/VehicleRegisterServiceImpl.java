package com.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.dao.VehicleRegDao;
import com.insurance.model.UserVehicle;


@Service
public class VehicleRegisterServiceImpl implements VehicleRegisterService {
@Autowired
public VehicleRegDao vrd;
	
	public int registerVehicle(UserVehicle uv) {
		return vrd.registerVehicle(uv);
	}

}

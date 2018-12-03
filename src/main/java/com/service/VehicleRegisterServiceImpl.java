package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.UserVehicle;
import com.dao.VehicleRegDao;


@Service
public class VehicleRegisterServiceImpl implements VehicleRegisterService {
@Autowired
public VehicleRegDao vrd;
	
	public int registerVehicle(UserVehicle uv) {
		return vrd.registerVehicle(uv);
	}

}

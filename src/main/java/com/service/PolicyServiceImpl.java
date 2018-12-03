package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PolicyDao;
import com.model.Policy;
import com.model.Ticket;

@Service
public class PolicyServiceImpl implements PolicyService{
	
	@Autowired
	PolicyDao policyDao;

	public int addPolicy(Policy p) {
		return policyDao.addPolicy(p);
		// TODO Auto-generated method stub
		
	}
	
	

	public List<Policy> show(String username) {
		return policyDao.show(username);
	}

	public int saveTicket(Ticket r, String username) {
		return policyDao.saveTicket(r, username);
	}

}

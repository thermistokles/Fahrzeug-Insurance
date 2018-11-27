package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.PolicyDao;
import com.model.Policy;
import com.model.Ticket;

public class PolicyServiceImpl implements PolicyService{
	
	@Autowired
	PolicyDao policyDao;

	public List<Policy> show(String username) {
		return policyDao.show(username);
	}

	public int saveTicket(Ticket r, String username) {
		return policyDao.saveTicket(r, username);
	}

}

package com.insurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.dao.RenewDao;
import com.insurance.model.Policy;
import com.insurance.model.Ticket;

@Service
public class RenewServiceImpl implements RenewService {
	@Autowired
	RenewDao renewDao;
	
	public List<Policy> getPolicyDetails(int policyId) {
		return renewDao.getPolicyDetails(policyId);
	}
	
	public int saveTicket(Ticket r,int policyId) {
		return renewDao.saveTicket(r, policyId);
	}

}

package com.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.dao.ClaimDao;
import com.insurance.model.Ticket;

@Service
public class ClaimServiceImpl implements ClaimService{
	@Autowired
	ClaimDao claimDao;

	public int saveTicket(Ticket r, String username) {
		return claimDao.saveTicket(r, username);
	}

}

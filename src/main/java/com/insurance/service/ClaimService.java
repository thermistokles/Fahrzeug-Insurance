package com.insurance.service;

import org.springframework.stereotype.Service;

import com.insurance.model.Ticket;

@Service
public interface ClaimService {
		int saveTicket(Ticket r,String username);
}

package com.service;

import org.springframework.stereotype.Service;
import com.model.Ticket;

@Service
public interface ClaimService {
		int saveTicket(Ticket r,String username);
}

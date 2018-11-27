package com.service;

import java.util.List;

import com.model.Policy;
import com.model.Ticket;

public interface PolicyService {
	List<Policy> show(String username);
	int saveTicket(Ticket r,String username);
}

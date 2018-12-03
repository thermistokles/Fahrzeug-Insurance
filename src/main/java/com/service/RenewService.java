package com.service;

import java.util.List;

import com.model.Policy;
import com.model.Ticket;

public interface RenewService {
	public List<Policy> getPolicyDetails(int policyId);
	public int saveTicket(Ticket r,int policyId);
}

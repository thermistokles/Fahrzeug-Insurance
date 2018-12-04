package com.insurance.service;

import java.util.List;

import com.insurance.model.Policy;
import com.insurance.model.Ticket;

public interface RenewService {
	public List<Policy> getPolicyDetails(int policyId);
	public int saveTicket(Ticket r,int policyId);
}

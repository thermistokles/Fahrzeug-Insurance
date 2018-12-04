package com.insurance.dao;

import java.util.List;

import com.insurance.model.Policy;
import com.insurance.model.Ticket;

public interface RenewDao {
	public List<Policy> getPolicyDetails(int policyId);
	int saveTicket(Ticket r,int policy_status);
}

package com.dao;

import java.util.List;
import com.model.Policy;
import com.model.Ticket;

public interface RenewDao {
	public List<Policy> getPolicyDetails(int policyId);
	int saveTicket(Ticket r,int policy_status);
}

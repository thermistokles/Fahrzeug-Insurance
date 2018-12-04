package com.insurance.dao;

import java.util.List;

import com.insurance.model.Policy;
import com.insurance.model.Ticket;

public interface PolicyDao {
	List<Policy> show(String username);
	int addPolicy(Policy p);
	int saveTicket(Ticket r, String username);
	int getPid(int userId);
}

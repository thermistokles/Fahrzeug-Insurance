package com.dao;

import java.util.List;

import com.model.Policy;
import com.model.Ticket;

public interface PolicyDao {
	List<Policy> show(String username);
	int saveTicket(Ticket r,String username);
}

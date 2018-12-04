package com.insurance.dao;


import com.insurance.model.Ticket;

public interface ClaimDao {
	int saveTicket(Ticket r,String username);
}

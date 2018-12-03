package com.dao;


import com.model.Ticket;

public interface ClaimDao {
	int saveTicket(Ticket r,String username);
}

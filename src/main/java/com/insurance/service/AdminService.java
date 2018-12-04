package com.insurance.service;

import java.util.List;

import com.insurance.model.Policy;
import com.insurance.model.Ticket;
import com.insurance.model.User;


public interface AdminService {
	public List<User> getAllUser();
	public List<Policy> getAllPolicy();
	public List<Ticket> getAllTicket();
	public List<Ticket> getTicketByNo(int ticketNo);
	 public int deleteUser(String username);
	 public int deletePolicy(int policyId);
	public int deletetickets(long ticketNo);
	public int approveTicket(int status,int ticketNo);
	public int getclaim(float amt,float amount,int id) ;
	
}

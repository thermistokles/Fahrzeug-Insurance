package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminDao;
import com.model.Policy;
import com.model.Ticket;
import com.model.User;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminDao adminDao;
	public List<User> getAllUser(){
		return adminDao.getAllUser();
	}
	public List<Policy> getAllPolicy(){
		return adminDao.getAllPolicy();
	}
	public List<Ticket> getAllTicket(){
		return adminDao.getAllTicket();
	}
	public List<Ticket> getTicketByNo(int ticketNo){
		return adminDao.getTicketByNo(ticketNo);
	}
	 public int deleteUser(String username) {
		 return adminDao.deleteUser(username);
	 }
	 public int deletePolicy(int policyId) {
		 return adminDao.deletePolicy(policyId);
	 }
		public int deletetickets(long ticketNo) {
			return adminDao.deletetickets(ticketNo);
		}
		public int approveTicket(int status,int ticketNo) {
			return adminDao.approveTicket(status, ticketNo);
		}
		public int getclaim(float amt,float amount,int id) {
			return adminDao.getclaim(amt, amount, id);
		}
}

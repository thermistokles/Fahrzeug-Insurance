package com.model;

public class Ticket {
	private int ticketNo;
	private int policyNo;
	private int ticketType;
	private int status;
	
	public int getTicketType() {
		return ticketType;
	}
	public void setTicketType(int ticketType) {
		this.ticketType = ticketType;
	}
	
	public int getticketNo() {
		return ticketNo;
	}
	public void setticketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}
	public int getpolicyNo() {
		return policyNo;
	}
	public void setpolicyNo(int policyNo) {
		this.policyNo = policyNo;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}

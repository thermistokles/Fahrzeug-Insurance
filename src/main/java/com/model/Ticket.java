package com.model;

public class Ticket {
	private long ticket_no;
	private int policy_no;
	private int status;
	
	public long getTicket_no() {
		return ticket_no;
	}
	public void setTicket_no(long ticket_no) {
		this.ticket_no = ticket_no;
	}
	public int getPolicy_no() {
		return policy_no;
	}
	public void setPolicy_no(int policy_no) {
		this.policy_no = policy_no;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}

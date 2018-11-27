package com.model;

public class Policy {
	private int policy_id;
	private int vehicle_id;
	private String policy_type;
	private String policy_status;
	private int Registration_no;
	private int chasis_no;
	private int engine_no;
	private int claim_amount;
	private int user_id;
	
	public int getPolicy_id() {
		return policy_id;
	}
	public void setPolicy_id(int policy_id) {
		this.policy_id = policy_id;
	}
	public int getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public String getPolicy_type() {
		return policy_type;
	}
	public void setPolicy_type(String policy_type) {
		this.policy_type = policy_type;
	}
	public String getPolicy_status() {
		return policy_status;
	}
	public void setPolicy_status(String policy_status) {
		this.policy_status = policy_status;
	}
	public int getRegistration_no() {
		return Registration_no;
	}
	public void setRegistration_no(int registration_no) {
		Registration_no = registration_no;
	}
	public int getChasis_no() {
		return chasis_no;
	}
	public void setChasis_no(int chasis_no) {
		this.chasis_no = chasis_no;
	}
	public int getEngine_no() {
		return engine_no;
	}
	public void setEngine_no(int engine_no) {
		this.engine_no = engine_no;
	}
	public int getClaim_amount() {
		return claim_amount;
	}
	public void setClaim_amount(int claim_amount) {
		this.claim_amount = claim_amount;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
}

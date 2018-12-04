package com.insurance.model;

public class Policy {
	private int PolicyId;	
	private int UserId;
	private String UserVehicleRegNo;
	private String PolicyType;
	private int PolicyStatus;
	private float ClaimAmount;
	private String StartDate;
	private String EndDate;
	
	public String getUserVehicleRegNo() {
		return UserVehicleRegNo;
	}
	public void setUserVehicleRegNo(String userVehicleRegNo) {
		UserVehicleRegNo = userVehicleRegNo;
	}
	public int getPolicyId() {
		return PolicyId;
	}
	public void setPolicyId(int policyId) {
		PolicyId = policyId;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	
	public String getPolicyType() {
		return PolicyType;
	}
	public void setPolicyType(String policyType) {
		PolicyType = policyType;
	}
	public int getPolicyStatus() {
		return PolicyStatus;
	}
	public void setPolicyStatus(int policyStatus) {
		PolicyStatus = policyStatus;
	}
	public float getClaimAmount() {
		return ClaimAmount;
	}
	public void setClaimAmount(float claimAmount) {
		ClaimAmount = claimAmount;
	}
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	public String getEndDate() {
		return EndDate;
	}
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}
	
	
	
	
}

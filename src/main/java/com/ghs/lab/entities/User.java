package com.ghs.lab.entities;


public class User {
	private Integer userDetailsId;
	private String fullName;
	private String emailId;
	private String phoneNumber;
	private String address;

	public Integer getUserDetailsId() {
		return userDetailsId;
	}

	public void setUserDetailsId(Integer userDetailsId) {
		this.userDetailsId = userDetailsId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

package com.ghs.lab.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "Lab")
public class Lab {

	@Id
	@GeneratedValue(strategy= GenerationType.TABLE)
	private Long id;
	private String labName;
	private String labLocation;
	private String address;
	private String phone;
	private String email;
	private String details;
	@NotNull
	private String franchiseeCode;


	public Lab(){}
	public Lab(Long id, String labName, String labLocation, String address, String phone, String email, String details) {
		this.id = id;
		this.labName = labName;
		this.labLocation = labLocation;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.details = details;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLabName() {
		return labName;
	}

	public void setLabName(String labName) {
		this.labName = labName;
	}

	public String getLabLocation() {
		return labLocation;
	}

	public void setLabLocation(String labLocation) {
		this.labLocation = labLocation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getFranchiseeCode() {
		return franchiseeCode;
	}

	public void setFranchiseeCode(String franchiseeCode) {
		this.franchiseeCode = franchiseeCode;
	}
}

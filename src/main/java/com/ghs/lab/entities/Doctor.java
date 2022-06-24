package com.ghs.lab.entities;


import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name="doctor")
public class Doctor {

	@Id
	@GeneratedValue(strategy= GenerationType.TABLE)
	private Long id;
	private String doctorName;
	private String doctorLocation;
	private String address;
	private String phone;
	private String email;
	private String details;
	@NotNull
	private String franchiseeCode;

	public Doctor() {
	}

	public Doctor(Long id, String doctorName, String doctorLocation, String address, String phone, String email, String details) {
		this.id = id;
		this.doctorName = doctorName;
		this.doctorLocation = doctorLocation;
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

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorLocation() {
		return doctorLocation;
	}

	public void setDoctorLocation(String doctorLocation) {
		this.doctorLocation = doctorLocation;
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

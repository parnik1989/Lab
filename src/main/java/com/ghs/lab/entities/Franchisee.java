package com.ghs.lab.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "franchisee")
public class Franchisee {

	@Id
	@GeneratedValue(strategy= GenerationType.TABLE)
	private Long id;
	private String name;
	private String category;
	private String location;
	private String address;
	private String phone;
	private String email;
	private String details;
	@Column(unique=true)
	@NotNull
	private String franchiseeCode;

	public Franchisee() {}

	public Franchisee(Long id, String name, String location, String address, String phone, String email, String details, String franchiseeCode) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.details = details;
		this.franchiseeCode = franchiseeCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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

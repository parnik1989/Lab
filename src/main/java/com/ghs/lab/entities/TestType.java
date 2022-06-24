package com.ghs.lab.entities;

import javax.persistence.*;

@Entity
@Table(name = "TestType")
public class TestType {

	@Id
	@GeneratedValue(strategy= GenerationType.TABLE)
	private Long Id;
	private String testCode;
	private String testName;
	private String sampleTypes;
	private Double amount;
	private String testDetails;

	public TestType(){}
	public TestType(Long id, String testCode, String testName, String sampleTypes, Double amount, String testDetails) {
		Id = id;
		this.testCode = testCode;
		this.testName = testName;
		this.sampleTypes = sampleTypes;
		this.amount = amount;
		this.testDetails = testDetails;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getTestCode() {
		return testCode;
	}

	public void setTestCode(String testCode) {
		this.testCode = testCode;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getSampleTypes() {
		return sampleTypes;
	}

	public void setSampleTypes(String sampleTypes) {
		this.sampleTypes = sampleTypes;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getTestDetails() {
		return testDetails;
	}

	public void setTestDetails(String testDetails) {
		this.testDetails = testDetails;
	}
}

package com.ghs.lab.entities;

import java.util.List;

public class TestPackage {

	private Integer id;
	private List<TestType> testTypeList;
	private String packageCode;
	private String packageName;
	private String packageDetails;
	private Double amount;

	public TestPackage(){}
	public TestPackage(Integer id, List<TestType> testTypeList, String packageCode, String packageName, String packageDetails, Double amount) {
		this.id = id;
		this.testTypeList = testTypeList;
		this.packageCode = packageCode;
		this.packageName = packageName;
		this.packageDetails = packageDetails;
		this.amount = amount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<TestType> getTestTypeList() {
		return testTypeList;
	}

	public void setTestTypeList(List<TestType> testTypeList) {
		this.testTypeList = testTypeList;
	}

	public String getPackageCode() {
		return packageCode;
	}

	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getPackageDetails() {
		return packageDetails;
	}

	public void setPackageDetails(String packageDetails) {
		this.packageDetails = packageDetails;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
}

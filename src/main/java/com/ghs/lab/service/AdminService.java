package com.ghs.lab.service;

import com.ghs.lab.entities.*;
import com.ghs.lab.response.LabResponse;

import java.util.List;

public interface AdminService {

	public List<Lab> getAllLabs();
	public List<Doctor> getAllDoctors();

	public List<TestType> getAllTestTypes();

	public List<TestPackage> getAllPackages();
	public Franchisee getLoggedInFranchisee();
	public List<Franchisee> getAllFranchisee();

	public Lab saveNewLab(Lab labRequest);

	public Doctor saveNewDoctor(Doctor doctorRequest);

	public TestType saveTestType(TestType testType);

	public Franchisee createNewFranchisee(Franchisee franchisee);
}

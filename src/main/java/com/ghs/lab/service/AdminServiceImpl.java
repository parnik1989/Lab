package com.ghs.lab.service;

import com.ghs.lab.entities.*;
import com.ghs.lab.repository.DoctorRepository;
import com.ghs.lab.repository.FranchiseeRepository;
import com.ghs.lab.repository.LabRepository;
import com.ghs.lab.repository.TestTypeRepository;
import com.ghs.lab.response.LabResponse;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private LabRepository labRepository;
	@Autowired
	private TestTypeRepository testTypeRepository;
	@Autowired
	private DoctorRepository doctorRepository;
	@Autowired
	private FranchiseeRepository franchiseeRepository;

	@Override
	public List<Lab> getAllLabs() {
		List<Lab> labList = labRepository.findAll();
		return labList;
	}

	@Override
	public List<Doctor> getAllDoctors() {
		List<Doctor> doctorList = doctorRepository.findAll();
		return doctorList;
	}

	@Override
	public List<TestType> getAllTestTypes() {
		List<TestType> testTypeList = testTypeRepository.findAll();
		return testTypeList;
	}

	@Override
	public List<TestPackage> getAllPackages() {
		TestType testType = new TestType(1L,"GHT001","Blood Sugar","Blood, Urine",1540.50,"Measure blood sugar levels");
		List<TestType> testTypeList = new ArrayList<TestType>();
		testTypeList.add(testType);

		TestPackage testPackage = new TestPackage(1, testTypeList,"GHP001","Aaarogyam 1.0","Full body checkup",3099.75);
		List<TestPackage> testPackageList = new ArrayList<TestPackage>();
		testPackageList.add(testPackage);
		return testPackageList;
	}

	@Override
	public Franchisee getLoggedInFranchisee() { return franchiseeRepository.findOne("BR001");}

	@Override
	public List<Franchisee> getAllFranchisee() { return franchiseeRepository.findAll();}

	@Override
	public Lab saveNewLab(Lab labRequest) { return labRepository.save(labRequest);	}

	@Override
	public Doctor saveNewDoctor(Doctor doctorRequest) { return doctorRepository.save(doctorRequest);}

	@Override
	public TestType saveTestType(TestType testType) {
		return testTypeRepository.save(testType);
	}

	@Override
	public Franchisee createNewFranchisee(Franchisee franchisee) {
		return franchiseeRepository.save(franchisee);
	}

}

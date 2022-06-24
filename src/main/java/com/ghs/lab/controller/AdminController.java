package com.ghs.lab.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.ghs.lab.entities.*;
import com.ghs.lab.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class AdminController {

	@Autowired
	AdminService adminService;

	@GetMapping("/getAllLabs")
	public ResponseEntity<List<Lab>> getAllLabDetails() {
		return ResponseEntity.ok(adminService.getAllLabs());
	}

	@GetMapping("/getAllDoctors")
	public ResponseEntity<List<Doctor>> getAllDoctorDetails() {
		return ResponseEntity.ok(adminService.getAllDoctors());
	}

	@GetMapping("/getAllTestTypes")
	public ResponseEntity<List<TestType>> getAllTestTypes() {
		return ResponseEntity.ok(adminService.getAllTestTypes());
	}
	@GetMapping("/getAllTestPackages")
	public ResponseEntity<List<TestPackage>> getAllPackageDetails() {
		return ResponseEntity.ok(adminService.getAllPackages());
	}

	@GetMapping("/getAllFranchisee")
	public ResponseEntity<List<Franchisee>> getAllFranchisee() {
		return ResponseEntity.ok(adminService.getAllFranchisee());
	}

	@GetMapping("/getFranchiseeDetail")
	public ResponseEntity<Franchisee> getFranchiseeDetail() {
		return ResponseEntity.ok(adminService.getLoggedInFranchisee());
	}

	@PostMapping("/saveNewLab")
	public ResponseEntity<Lab> saveNewLab(@RequestBody Lab labRequest) {
		return ResponseEntity.ok(adminService.saveNewLab(labRequest));
	}

	@PostMapping("/saveNewDoctor")
	public ResponseEntity<Doctor> saveNewDoctor(@RequestBody Doctor doctorRequest) {
		System.out.println(doctorRequest);
		return ResponseEntity.ok(adminService.saveNewDoctor(doctorRequest));
	}

	@PostMapping("/saveTestType")
	public ResponseEntity<TestType> saveNewTestType(@RequestBody TestType testType) {
		return ResponseEntity.ok(adminService.saveTestType(testType));
	}

	@PostMapping("/createNewFranchisee")
	public ResponseEntity<Franchisee> createNewFranchisee(@RequestBody Franchisee franchisee) {
		return ResponseEntity.ok(adminService.createNewFranchisee(franchisee));
	}


}

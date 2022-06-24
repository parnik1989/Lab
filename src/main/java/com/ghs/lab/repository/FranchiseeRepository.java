package com.ghs.lab.repository;

import com.ghs.lab.entities.Franchisee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FranchiseeRepository extends JpaRepository<Franchisee, Integer> {
	@Query("select f from Franchisee f where f.franchiseeCode = ?1")
	public Franchisee findOne(String franchiseeCode);
}

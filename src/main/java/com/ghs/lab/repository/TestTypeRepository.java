package com.ghs.lab.repository;

import com.ghs.lab.entities.TestType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TestTypeRepository extends JpaRepository<TestType, Integer> {

}

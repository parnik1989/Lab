package com.ghs.lab.repository;

import com.ghs.lab.entities.Lab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LabRepository extends JpaRepository<Lab, Long> {

}

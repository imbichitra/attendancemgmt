package com.asiczen.api.attendancemgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asiczen.api.attendancemgmt.model.Empinout;

@Repository
public interface EmpinoutRepository extends JpaRepository<Empinout,Long>{

}

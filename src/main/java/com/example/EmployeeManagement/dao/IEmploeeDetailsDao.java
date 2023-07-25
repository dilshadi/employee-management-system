package com.example.EmployeeManagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeManagement.model.EmployeeDetails;

@Repository
public interface IEmploeeDetailsDao extends JpaRepository<EmployeeDetails, Integer> {
	// fetch all employees according to the paid status either over paid or under paid
	
	List<EmployeeDetails> findByPaidStatusEqualsIgnoreCase(String paidStatus);

	// group employees by their blood group
	List<EmployeeDetails> findByBloodGroupEqualsIgnoreCase(String bloodGroup);
}

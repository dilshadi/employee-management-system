package com.example.EmployeeManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeManagement.DTO.EmployeeDetailsDto;
import com.example.EmployeeManagement.DTO.ResponseDto;
import com.example.EmployeeManagement.model.EmployeeDetails;
import com.example.EmployeeManagement.service.IEmployeeDetailsService;

import jakarta.validation.Valid;

@RestController
public class EmployeeDetailsRestController {

	@Autowired
	private IEmployeeDetailsService service;

	/**
	 * method to save employee details
	 * 
	 * @param employee
	 * @return
	 */
	@PostMapping("save-employee")
	public ResponseDto save(@Valid @RequestBody EmployeeDetails employee) {
		return service.saveEmployee(employee);
	}

	/**
	 * method to list all employees
	 * 
	 * @return
	 */
	@GetMapping("get-all-employees")
	public ResponseDto getAllEmployees() {
		return service.getAllEmployees();
	}

	/**
	 * method to update an existing employee details
	 * 
	 * @param employee
	 * @return
	 */
	@PutMapping("update-employee")
	public ResponseDto updateEmployee(@RequestBody EmployeeDetailsDto employee) {
		return service.updateEmployee(employee);
	}

	/**
	 * method to find all over paid and under paid employees
	 * 
	 * @param employeeDto
	 * @return
	 */
	@GetMapping("get-all-underpaid-or-overpaid-employees")
	public ResponseDto getUnderPaidOrOverPaidEmployees(@RequestBody EmployeeDetailsDto employeeDto) {
		return service.getOverPaidAndLowerPaidEmployees(employeeDto);
	}

	/**
	 * method to group employees by blood group
	 * 
	 * @param employeeDto
	 * @return
	 */
	@GetMapping("get-employees-by-bloodgroup")
	public ResponseDto getemployeesBloodGroup(@RequestBody EmployeeDetailsDto employeeDto) {
		return service.getEmployeesBloodGroup(employeeDto);
	}
}

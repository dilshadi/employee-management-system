package com.example.EmployeeManagement.service;

import com.example.EmployeeManagement.DTO.EmployeeDetailsDto;
import com.example.EmployeeManagement.DTO.ResponseDto;
import com.example.EmployeeManagement.model.EmployeeDetails;

public interface IEmployeeDetailsService {

	public ResponseDto saveEmployee(EmployeeDetails employee);

	public ResponseDto getAllEmployees();

	public ResponseDto updateEmployee(EmployeeDetailsDto employeeDto);

	public ResponseDto getOverPaidAndLowerPaidEmployees(EmployeeDetailsDto employeeDto);

	public ResponseDto getEmployeesBloodGroup(EmployeeDetailsDto employeeDto);

}

package com.example.EmployeeManagement.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeManagement.DTO.EmployeeDetailsDto;
import com.example.EmployeeManagement.DTO.ResponseDto;
import com.example.EmployeeManagement.dao.IEmploeeDetailsDao;
import com.example.EmployeeManagement.model.EmployeeDetails;
import com.example.EmployeeManagement.service.IEmployeeDetailsService;

@Service
public class EmployeeDetailsServiceImpl implements IEmployeeDetailsService {

	@Autowired
	private IEmploeeDetailsDao dao;

	// save employee details
	@Override
	public ResponseDto saveEmployee(EmployeeDetails employee) {
		try {
			int yearOfExperience = employee.getYearOfExperiance();
			float ctc = employee.getCtc();
			float paymentStatus = ctc / yearOfExperience;
			if (paymentStatus > 1) {
				employee.setPaidStatus("Overpaid");
			} else {
				employee.setPaidStatus("UnderPaid");
			}
			EmployeeDetails newEmployee = dao.save(employee);
			return new ResponseDto(201, true, "Employee Details saved successfully", newEmployee);
		} catch (Exception e) {
			return new ResponseDto(500, false, " Failed", null);
		}
	}

	// method to fetch all employees
	@Override
	public ResponseDto getAllEmployees() {
		try {
			List<EmployeeDetails> employeeList = dao.findAll();
			if (!employeeList.isEmpty()) {
				return new ResponseDto(200, true, "Success", employeeList);
			} else {
				return new ResponseDto(204, true, "No content", employeeList);
			}
		} catch (Exception e) {
			return new ResponseDto(500, false, " Failed", null);
		}
	}

	// update existing employee details
	@Override
	public ResponseDto updateEmployee(EmployeeDetailsDto employeeDto) {
		try {
			Optional<EmployeeDetails> employeeDetails = dao.findById(employeeDto.getId());
			if (employeeDetails.isPresent()) {
				BeanUtils.copyProperties(employeeDto, employeeDetails.get());
				EmployeeDetails newEmployee = dao.save(employeeDetails.get());
				return new ResponseDto(200, true, " updatedsuccessfully", newEmployee);
			} else {
				return new ResponseDto(404, false, " Employee not found", null);
			}
		} catch (Exception e) {
			return new ResponseDto(500, false, " Failed", null);
		}
	}

	// method to show over paid and under paid employees
	@Override
	public ResponseDto getOverPaidAndLowerPaidEmployees(EmployeeDetailsDto employeeDto) {
		try {
			String lowPaidorOverPaid = employeeDto.getOvePaidOrUnderPaid();
			List<EmployeeDetails> employeeList = dao.findByPaidStatusEqualsIgnoreCase(lowPaidorOverPaid);
			if (!employeeList.isEmpty()) {
				return new ResponseDto(200, true, " success", employeeList);
			} else {
				return new ResponseDto(204, true, "No content", employeeList);
			}
		} catch (Exception e) {
			return new ResponseDto(500, false, " Failed", null);
		}
	}

	// method to group employees by blood group
	@Override
	public ResponseDto getEmployeesBloodGroup(EmployeeDetailsDto employeeDto) {
		try {
			String bloodGroup = employeeDto.getBloodGroup();
			List<EmployeeDetails> employeeList = dao.findByBloodGroupEqualsIgnoreCase(bloodGroup);
			if (!employeeList.isEmpty()) {
				return new ResponseDto(200, true, " success", employeeList);
			} else {
				return new ResponseDto(204, true, "No content", employeeList);
			}
		} catch (Exception e) {
			return new ResponseDto(500, false, " Failed", null);
		}
	}

}

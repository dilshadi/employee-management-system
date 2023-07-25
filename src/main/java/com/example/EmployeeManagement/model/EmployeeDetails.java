package com.example.EmployeeManagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "employee_details")
public class EmployeeDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "name", nullable = false)
	@NotEmpty(message = "Please provide  name")
	private String name;
	@Column(name = "address", nullable = false)
	private String address;
	@NotEmpty(message = "Please provide  Designation")
	@Column(name = "designation", nullable = false)
	private String designation;
	@NotEmpty(message = "Please provide mobile")
	@Column(name = "mobile", nullable = false)
	@Size(min = 0, max = 10)
	private String mobile;
	@Column(name = "email", nullable = false)
	private String email;
	@NotNull(message = "Please provide ctc")
	@Column(name = "ctc", nullable = false)
	private float ctc;
	@NotNull(message = "Please provide Experience")
	@Column(name = "yearOfExperiance", nullable = false)
	private int yearOfExperiance;

	public EmployeeDetails() {
		super();
	}

	@Column(name = "bloodGroup", nullable = false)
	@NotEmpty(message = "Please blood group")
	private String bloodGroup;
	@Column(name = "paidStatus", nullable = false)
	private String paidStatus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getCtc() {
		return ctc;
	}

	public void setCtc(float ctc) {
		this.ctc = ctc;
	}

	public int getYearOfExperiance() {
		return yearOfExperiance;
	}

	public void setYearOfExperiance(int yearOfExperiance) {
		this.yearOfExperiance = yearOfExperiance;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getPaidStatus() {
		return paidStatus;
	}

	public void setPaidStatus(String paidStatus) {
		this.paidStatus = paidStatus;
	}

}

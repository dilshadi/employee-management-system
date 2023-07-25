package com.example.EmployeeManagement.DTO;

public class EmployeeDetailsDto {
	public EmployeeDetailsDto() {
		super();
	}

	private Integer id;
	private String name;
	private String address;
	private String designation;
	private String mobile;
	private String email;
	private float ctc;
	private int yearOfExperiance;
	private String bloodGroup;
	private String ovePaidOrUnderPaid;

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

	public String getOvePaidOrUnderPaid() {
		return ovePaidOrUnderPaid;
	}

	public void setOvePaidOrUnderPaid(String ovePaidOrUnderPaid) {
		this.ovePaidOrUnderPaid = ovePaidOrUnderPaid;
	}

}

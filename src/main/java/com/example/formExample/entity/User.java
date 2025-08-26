package com.example.formExample.entity;

import jakarta.persistence.Entity;
//import jakarta.validation.constraints.*;
import jakarta.persistence.*;
//import com.fasterxml.jackson.annotation.*;

//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.validation.constraints.*;

import java.time.LocalDate;
@Entity
//@Table(
//		name="user",
//		uniqueConstraints= {
//				
//		@UniqueConstraint(name="uk_user_email",columnNames="email")
//		}
//		)

public class User{
	
//	@NotBlank(message="Name of the student is required")
//	@Size(max=100,message="Name of the student must be lessthan or equal to 100 chars")
	private String nameOfTheStudent;
	@Id
//	@Positive(message="Registration No must be a positive number")
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private long registrationNo;
	
//	@NotBlank(message="Father Name is required")
//	@Size(max=100,message="Father Name must be lessthan or equal to 100 chars")
	private String fatherName;
//	
//	@NotNull(message="Date Of Birth is required")
//	@Past(message="Date Of Birth must be in the past")
//	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate dateOfBirth;
//	
//	@NotBlank(message="Department is required")
//	@Size(max=60,message="Department must be lessthan or equal to 60 chars")
	private String department;
//	
//	@NotBlank(message="Name of the Institute is required")
//	@Size(max=150,message="Name of the Institute must be lessthan or equal to 150 chars")
	private String nameOfTheInstitute;
	
//	@NotBlank(message="Mobile no is required")
//	@Pattern(regexp="^[6-9]\\d{9}$",message="Mobile no must be a 10-digit Indian number")
	private String mobileNo;
	
//	@NotBlank(message="Email is required")
//	@Email(message="Email must be valid")
//	@Size(max=120,message="Email must be lessthan or equal to 120 chars")
	@Column(nullable=false)
	private String email;
//	
//	@NotBlank(message="Address is required")
//	@Size(max=200,message="Address must be lessthan or equal to 200 chars")
	private String address;
	

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	

	public String getNameOfTheStudent() {
		return nameOfTheStudent;
	}
	public void setNameOfTheStudent(String nameOfTheStudent) {
		this.nameOfTheStudent = nameOfTheStudent;
	}
	public long getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(long registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getNameOfTheInstitute() {
		return nameOfTheInstitute;
	}
	public void setNameOfTheInstitute(String nameOfTheInstitute) {
		this.nameOfTheInstitute = nameOfTheInstitute;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [nameOfTheStudent=" + nameOfTheStudent + ", registrationNo=" + registrationNo + ", fatherName="
				+ fatherName + ", dateOfBirth=" + dateOfBirth + ", department=" + department + ", nameOfTheInstitute="
				+ nameOfTheInstitute + ", mobileNo=" + mobileNo + ", email=" + email + ", address=" + address + "]";
	}
	public User(String nameOfTheStudent, long registrationNo, String fatherName, LocalDate dateOfBirth, String department,
		String nameOfTheInstitute, String mobileNo, String email, String address) {
	super();
	this.nameOfTheStudent = nameOfTheStudent;
	this.registrationNo = registrationNo;
	this.fatherName = fatherName;
	this.dateOfBirth = dateOfBirth;
	this.department = department;
	this.nameOfTheInstitute = nameOfTheInstitute;
	this.mobileNo = mobileNo;
	this.email = email;
	this.address = address;
}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
}

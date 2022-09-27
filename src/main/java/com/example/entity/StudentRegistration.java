package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class StudentRegistration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="student_id")
	private long studentId;
	@Column(name="student_name")
	private String name;
	@Column(name="student_email")
	private String email;
	@Column(name="contact_number")
	private String number;
	@Column(name="password")
	private String password;
	@Column(name="gender")
	private String gender;
	
	public StudentRegistration() {
		super();
	}
	public StudentRegistration(long studentId, String name, String email, String number, String password, String gender) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.email = email;
		this.number = number;
		this.password = password;
		this.gender = gender;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}

package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentLogin {
	
	@Id
	private String email;
	private String password;
	
	public StudentLogin() {
		super();
	}
	
	public StudentLogin(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

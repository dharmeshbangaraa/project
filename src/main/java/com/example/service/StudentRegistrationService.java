package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.StudentLogin;
import com.example.entity.StudentRegistration;
import com.example.repo.StudentRegistrationRepository;



@Service
public class StudentRegistrationService {
	
@Autowired private StudentRegistrationRepository studentRegistrationRepository;
	
	public StudentRegistration addStudent(StudentRegistration student) {
		return studentRegistrationRepository.save(student);
	}
	
	public StudentRegistration getStudentDetails(int studentId) {
		return studentRegistrationRepository.findByStudentId(studentId);
	}
	
	public StudentRegistration login(StudentLogin studentLogin) {
		StudentRegistration student=studentRegistrationRepository.findByEmail(studentLogin.getEmail());
		if(studentLogin.getPassword().equals(student.getPassword())) return student;
		return null;
	}
	
	public StudentRegistration updateStudent(int studentId, StudentRegistration student) {	
		StudentRegistration studentProfile = studentRegistrationRepository.findByStudentId(studentId);
		
		studentProfile.setName(student.getName());
		studentProfile.setEmail(student.getEmail());
		studentProfile.setPassword(student.getPassword());
		studentProfile.setNumber(student.getNumber());
		studentProfile.setGender(student.getGender());
		
		
		return studentRegistrationRepository.save(studentProfile);
		
	}
	
	
	

}

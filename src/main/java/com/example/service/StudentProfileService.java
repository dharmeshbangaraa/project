package com.example.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.StudentProfile;
import com.example.repo.StudentProfileRepository;

@Service
public class StudentProfileService {
	
	@Autowired private StudentProfileRepository studentProfileRepository;
	
	public StudentProfile registerStudent(StudentProfile student) {
		return studentProfileRepository.save(student);
		
	}
	
	public StudentProfile updateStudent(int studentId, StudentProfile student) {
		
		StudentProfile studentProfile = studentProfileRepository.findByStudentId(studentId);
		
		studentProfile.setName(student.getName());
		studentProfile.setEmail(student.getEmail());
		studentProfile.setPassword(student.getPassword());
		studentProfile.setMobileno(student.getMobileno());
		
		
		return studentProfileRepository.save(studentProfile);
		
	}

}

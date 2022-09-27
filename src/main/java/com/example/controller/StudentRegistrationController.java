package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.converter.StudentLoginDtoConverter;
import com.example.converter.StudentRegistrationDtoConverter;
import com.example.entity.StudentLogin;
import com.example.entity.StudentRegistration;
import com.example.service.StudentRegistrationService;

import dto.StudentLoginDto;
import dto.StudentRegistrationDto;



@RestController
@CrossOrigin(origins="*")
public class StudentRegistrationController {
	
	@Autowired
	private StudentRegistrationService studentRegistrationService;
	
	@Autowired private StudentRegistrationDtoConverter converter;
	@Autowired private StudentLoginDtoConverter studentLoginConverter;
	
	
	@PostMapping("/register/student")
	public StudentRegistrationDto registerStudent(@RequestBody StudentRegistrationDto studentDto) {
		StudentRegistration studentRegistration = converter.dtoToEntity(studentDto);
		studentRegistration = studentRegistrationService.addStudent(studentRegistration);
		return converter.entityToDto(studentRegistration);
	}
	
	@PostMapping("/login/student")
	public StudentRegistrationDto loginStudent(@RequestBody StudentLoginDto studentLoginDto) {
		StudentLogin studentLogin = studentLoginConverter.dtoToEntity(studentLoginDto);
		StudentRegistration studentRegistration = studentRegistrationService.login(studentLogin);
		return converter.entityToDto(studentRegistration); 
	}
	
	@PutMapping("/student-profile/{studentId}")
	public StudentRegistrationDto updateStudent(@PathVariable int studentId, @RequestBody StudentRegistrationDto studentDto) {
		StudentRegistration studentRegistration = converter.dtoToEntity(studentDto);
		studentRegistration = studentRegistrationService.updateStudent(studentId, studentRegistration);
		return converter.entityToDto(studentRegistration);
	}
	
	@GetMapping("/student-profile/{studentId}")
	public StudentRegistration getStudent(@PathVariable int studentId) {
		return studentRegistrationService.getStudentDetails(studentId);
	}

}

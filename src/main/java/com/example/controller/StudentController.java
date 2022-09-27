package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.converter.StudentDtoConverter;
import com.example.entity.Student;
import com.example.service.StudentService;

import dto.StudentDto;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	@Autowired StudentDtoConverter converter;
	
	@PostMapping("/student")
	public StudentDto addStudent(@RequestBody StudentDto studentDto) {
		Student student = converter.dtoToEntity(studentDto);
		student = studentService.addStudent(student);
		return converter.entityToDto(student);
	}
	
	@GetMapping("/student")
	public List<Student> getStudents(){
		return this.studentService.getStudents();
	}
}

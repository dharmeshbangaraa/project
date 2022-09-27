package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repo.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public Student addStudent(Student student) {
		return this.studentRepository.save(student);
	}
	
	public List<Student> getStudents(){
		return this.studentRepository.findAll();
	}
}

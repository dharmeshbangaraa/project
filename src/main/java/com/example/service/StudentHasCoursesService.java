package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.StudentHasCourses;
import com.example.repo.StudentHasCoursesRepository;

@Service
public class StudentHasCoursesService {
	
	@Autowired
	private StudentHasCoursesRepository studentHasCoursesRepository;
	
	public StudentHasCourses addCourse(StudentHasCourses studentHasCourses) {
		return this.studentHasCoursesRepository.save(studentHasCourses);
	}
	
	public List<StudentHasCourses> getStudentprofileCourses(int studentId){
		return this.studentHasCoursesRepository.findStudentprofileCourses(studentId);
	}
}

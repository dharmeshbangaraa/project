package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.converter.StudentHasCoursesDtoConverter;
import com.example.entity.StudentHasCourses;
import com.example.service.StudentHasCoursesService;

import dto.StudentHasCoursesDto;

@RestController
@CrossOrigin(origins="*")
public class StudentHasCoursesController {
	
	@Autowired
	private StudentHasCoursesService studentHasCoursesService;
	@Autowired StudentHasCoursesDtoConverter converter;
	
	@PostMapping("/student-courses")
	public StudentHasCoursesDto addCourse(@RequestBody StudentHasCoursesDto studentHasCoursesDto) {
		StudentHasCourses studentHasCourses = converter.dtoToEntity(studentHasCoursesDto);
		studentHasCourses = studentHasCoursesService.addCourse(studentHasCourses);
		return converter.entityToDto(studentHasCourses);
	}
	
	@GetMapping("/studentcourses/{studentId}")
	public List<StudentHasCourses> getStudentprofileCourses(@PathVariable int studentId){
		return this.studentHasCoursesService.getStudentprofileCourses(studentId);
	}

}

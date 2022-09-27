package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.converter.DtoConverter;
import com.example.entity.Courses;
import com.example.service.CourseService;

import dto.CourseDto;


@CrossOrigin(origins = "*")
@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@Autowired private DtoConverter converter;
	
	@PostMapping("/course")
	public CourseDto addCourse(@RequestBody CourseDto courseDto) {
		Courses course = converter.dtoToEntity(courseDto);
		course = this.courseService.addCourse(course);
		return converter.entityToDto(course);
	}
	
	@GetMapping("/courses")
	public List<Courses> getCourses(){
		return this.courseService.getCourses();
	}
	
	@PutMapping("/course")
	public CourseDto updateCourse(@RequestBody CourseDto courseDto) {
		Courses course = converter.dtoToEntity(courseDto);
		course = courseService.updateCourse(course);
		return converter.entityToDto(course);
	}
	
	@DeleteMapping("/course{id}")
	public void deleteCourse(@PathVariable Long id) {
		courseService.deleteCourse(id);
	}
	
	
	
	
}

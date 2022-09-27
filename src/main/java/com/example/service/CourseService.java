package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Courses;
import com.example.repo.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	
	public Courses addCourse(Courses course) {
		return this.courseRepository.save(course);
	}
	
	public List<Courses> addCourses(List<Courses> courses){
		return this.courseRepository.saveAll(courses);
	}
	
	public List<Courses> getCourses(){
		return this.courseRepository.findAll();
	}
	
	public Courses getCourseById(long courseId) {
		return this.courseRepository.findById(courseId).orElse(null);
	}
	
	public Courses updateCourse(Courses course) {
		Long id = course.getCourseId();
		Courses std = this.courseRepository.findById(id).orElse(course);
			std.setCourseName(course.getCourseName());
			std.setCategory(course.getCategory());
			std.setPrice(course.getPrice());
			std.setDuration(course.getDuration());
			std.setNoOfAssessments(course.getNoOfAssessments());
			std.setCourseUrl(course.getCourseUrl());
			return this.courseRepository.save(std);
		
	}
	
	public void deleteCourse(Long id) {
		courseRepository.deleteById(id);
	}
	
}

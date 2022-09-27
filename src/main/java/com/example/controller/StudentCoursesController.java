package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.converter.StudentCourseDtoConverter;
import com.example.entity.StudentCourses;
import com.example.service.StudentCourseService;

import dto.StudentCourseDto;

@CrossOrigin(origins="*")
@RestController
public class StudentCoursesController {
	
	@Autowired
	private StudentCourseService studentCoursesService;
	@Autowired StudentCourseDtoConverter converter;
	

	@PostMapping("/student-course")
	public StudentCourseDto addStudentCourse(@RequestBody StudentCourseDto studentCourseDto) {
		StudentCourses studentCourse = converter.dtoToEntity(studentCourseDto);
		studentCourse = studentCoursesService.addStudentCourses(studentCourse);
		return converter.entityToDto(studentCourse);
	}
	
	@GetMapping("/student-course")
	public List<StudentCourses> getStudentCourses(){
		return this.studentCoursesService.getStudentCourses();
	}
	
	@GetMapping("/student-leaderboard")
	public List<StudentCourses> getStudentCoursesLeaderboard(){
		return this.studentCoursesService.getStudentCoursesLeaderboard();
	}
	
	@GetMapping("/student-leaderboard/{courseId}")
	public List<StudentCourses> getStudentLeaderboardById(@PathVariable int courseId) {
		return this.studentCoursesService.getStudentCoursesLeaderboardById(courseId);
	}
	
	@GetMapping("/student-progress/{studentId}")
    public List<StudentCourses> findAllByStudentId(@PathVariable int studentId){
    	try {
            return studentCoursesService.findAllByStudentId(studentId);
        }catch (Exception exception){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,exception.getMessage());
            
        }
    }
	
}

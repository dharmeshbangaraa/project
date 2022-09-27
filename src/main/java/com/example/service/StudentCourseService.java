package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.StudentCourses;
import com.example.repo.StudentCoursesRepository;

@Service
public class StudentCourseService {
	
	@Autowired
	private StudentCoursesRepository studentCoursesRepository;
	
	public StudentCourses addStudentCourses(StudentCourses studentCourses) {
		return this.studentCoursesRepository.save(studentCourses);
	}
	
	public List<StudentCourses> getStudentCourses(){
		return this.studentCoursesRepository.findAll();
	}
	
	public List<StudentCourses> getStudentCoursesLeaderboard(){
		return this.studentCoursesRepository.findByScore();
	}
	
	public List<StudentCourses> getStudentCoursesLeaderboardById(int courseId) {
		return this.studentCoursesRepository.findLeaderboardById(courseId);
	}
	
	public List<StudentCourses> findAllByStudentId(int studentId) {
		return studentCoursesRepository.findAllByStudentId(studentId);
	}

}

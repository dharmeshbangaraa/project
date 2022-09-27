package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student_has_courses")
public class StudentHasCourses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="course_id")
	private int courseId;
	
	@Column(name="student_id")
	private int studentId;
	
	@OneToOne(targetEntity=Courses.class)
	@JoinColumn(name="courses_course_id", referencedColumnName = "course_id")
	private Courses course;

	public StudentHasCourses() {
		super();
	}

	public StudentHasCourses(int courseId, int studentId, Courses course) {
		super();
		this.courseId = courseId;
		this.studentId = studentId;
		this.course = course;
	}

	public Courses getCourse() {
		return course;
	}

	public void setCourse(Courses course) {
		this.course = course;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

}

package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="feedback")
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="serial_id")
	private int serialId;
	
	@Column(name="student_id")
	private int studentId;
	
	@Column(name="student_name")
	private String studentName;
	
	@Column(name="course_id")
	private int courseId;
	
	@Column(name="feedback")
	private String feedbackDescription;

	public Feedback() {
		super();
	}

	public Feedback(int serialId, int studentId, String studentName, int courseId, String feedbackDescription) {
		super();
		this.serialId = serialId;
		this.studentId = studentId;
		this.studentName = studentName;
		this.courseId = courseId;
		this.feedbackDescription = feedbackDescription;
	}

	public int getSerialId() {
		return serialId;
	}

	public void setSerialId(int serialId) {
		this.serialId = serialId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getFeedback() {
		return feedbackDescription;
	}

	public void setFeedback(String feedbackDescription) {
		this.feedbackDescription = feedbackDescription;
	}
	
	
	
	
}

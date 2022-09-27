package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name="studentcourses")
@Table(name="studentcourses")
public class StudentCourses {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="serial_id")
	private long serialId;
	@Column(name="student_id")
	private long studentId;
	@Column(name = "course_id")
	private long courseId;
	@Column(name="assessment_id")
	private long assessmentId;
	@Column(name="assessment_score")
	private int assessmentScore;
	
	
	public StudentCourses() {
		super();
	}
	public StudentCourses( long serialId, long studentId, long courseId, long assessmentId, int assessmentScore) {
		super();
		this.studentId = studentId;
		this.serialId = serialId;
		this.courseId = courseId;
		this.assessmentId = assessmentId;
		this.assessmentScore = assessmentScore;
	}

	public long getSerialId() {
		return serialId;
	}
	public void setSerialId(long serialId) {
		this.serialId = serialId;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public long getCourseId() {
		return courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	public long getAssessmentId() {
		return assessmentId;
	}
	public void setAssessmentId(long assessmentId) {
		this.assessmentId = assessmentId;
	}
	public int getAssessmentScore() {
		return assessmentScore;
	}
	public void setAssessmentScore(int assessmentScore) {
		this.assessmentScore = assessmentScore;
	}

}

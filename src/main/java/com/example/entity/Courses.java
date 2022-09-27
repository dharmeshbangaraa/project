package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courses")
public class Courses {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="course_id")
	private long courseId;
	@Column(name="course_url")
	private String courseUrl;
	@Column(name="course_name")
	private String courseName;
	@Column(name="course_category")
	private String category;
	@Column(name="course_duration")
	private int duration;
	@Column(name="course_price")
	private double price;
	@Column(name="no_of_assessments")
	private int noOfAssessments;
	
	public Courses() {
		super();
	}

	public Courses(long courseId, String courseUrl, String courseName, String category, int duration, double price, int noOfAssessments) {
		super();
		this.courseUrl = courseUrl;
		this.courseId = courseId;
		this.courseName = courseName;
		this.category = category;
		this.duration = duration;
		this.price = price;
		this.noOfAssessments = noOfAssessments;
	}


	public String getCourseUrl() {
		return courseUrl;
	}

	public void setCourseUrl(String courseUrl) {
		this.courseUrl = courseUrl;
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoOfAssessments() {
		return noOfAssessments;
	}

	public void setNoOfAssessments(int noOfAssessments) {
		this.noOfAssessments = noOfAssessments;
	}	

}

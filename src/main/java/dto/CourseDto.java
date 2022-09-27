package dto;

public class CourseDto {

	
	private long courseId;
	private String courseUrl;
	private String courseName;
	private String category;
	private int duration;
	private double price;
	private int noOfAssessments;
	
	public long getCourseId() {
		return courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	public String getCourseUrl() {
		return courseUrl;
	}
	public void setCourseUrl(String courseUrl) {
		this.courseUrl = courseUrl;
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

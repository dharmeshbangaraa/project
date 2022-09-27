package dto;



import com.example.entity.Student;

public class StudentCourseDto {
	
	private long studentId;
	private long courseId;
	private long assessmentId;
	private int assessmentScore;
	private Student student;
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
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	

}

package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.StudentCourses;

@Repository
public interface StudentCoursesRepository extends JpaRepository<StudentCourses, Long>{
	
	@Query(value="select * from studentcourses where (course_id,assessment_score) in (select course_id, max(assessment_score) from studentcourses group by course_id)", nativeQuery=true)
	public List<StudentCourses> findByScore();
	
	@Query(value="select * from studentcourses where (course_id, assessment_score) in (select course_id, assessment_score from studentcourses where course_id = ?) order by assessment_score desc", nativeQuery=true)
	public List<StudentCourses> findLeaderboardById(int courseId);
	
	@Query(value="select * from studentcourses where assessment_score in (select max(assessment_score) where student_id = ?) group by course_id;", nativeQuery = true)
	public List<StudentCourses> findAllByStudentId(Integer studentId);
	

}

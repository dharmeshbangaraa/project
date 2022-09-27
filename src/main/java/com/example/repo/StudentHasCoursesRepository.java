package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.StudentHasCourses;

@Repository
public interface StudentHasCoursesRepository extends JpaRepository<StudentHasCourses, Integer> {

	@Query(value="select * from student_has_courses where student_id = ?", nativeQuery=true)
	public List<StudentHasCourses> findStudentprofileCourses(int studentId);
}

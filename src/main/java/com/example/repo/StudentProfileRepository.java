package com.example.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.StudentProfile;

@Repository
public interface StudentProfileRepository extends JpaRepository<StudentProfile, Integer>{
	
	@Query(value="select * from student_profile where student_id = ?", nativeQuery = true)
	public StudentProfile findByStudentId(int studentId);

}

package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.StudentRegistration;

@Repository
public interface StudentRegistrationRepository extends JpaRepository<StudentRegistration, Long>{
	
	StudentRegistration findByEmail(String email);
	
	@Query(value="select * from student where student_id = ?", nativeQuery = true)
	public StudentRegistration findByStudentId(int studentId);

}

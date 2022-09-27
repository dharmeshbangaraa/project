package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Courses;

@Repository
public interface CourseRepository extends JpaRepository<Courses, Long>{

}

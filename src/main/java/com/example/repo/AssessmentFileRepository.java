package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.AssessmentFile;

@Repository
public interface AssessmentFileRepository extends JpaRepository<AssessmentFile, String>{

}

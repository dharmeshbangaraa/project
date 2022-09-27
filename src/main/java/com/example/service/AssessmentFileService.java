package com.example.service;

import java.io.IOException;
import java.util.UUID;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.entity.AssessmentFile;
import com.example.repo.AssessmentFileRepository;

@Service
public class AssessmentFileService {
	
	@Autowired
	private AssessmentFileRepository assessmentFileRepository;
	
	public void store(MultipartFile file) throws IOException {
		String fileName = file.getOriginalFilename();
		AssessmentFile assessmentFile = new AssessmentFile(UUID.randomUUID().toString(), fileName, file.getContentType(),  file.getBytes());
		 assessmentFileRepository.save(assessmentFile);
	}

	public Stream<AssessmentFile> getAllFile(){
		return assessmentFileRepository.findAll().stream();
	}
	
	public AssessmentFile getFile(String id) {
	    return (assessmentFileRepository.findById(id).orElse(null));
	  }
}

package com.example.controller;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.entity.AssessmentFile;
import com.example.entity.ResponseFile;
import com.example.service.AssessmentFileService;

@RestController
@CrossOrigin(origins = "*")
public class AssessmentFileController {
	
	@Autowired
	private AssessmentFileService assessmentFileService;
	
	@PostMapping("/list")
	public void storeFile(@RequestParam("file") MultipartFile file) throws IOException {
		assessmentFileService.store(file);
		
	}
	
	@GetMapping("/list")
	  public ResponseEntity<List<ResponseFile>> getListFiles() {
	    List<ResponseFile> files = assessmentFileService.getAllFile().map(dbFile -> {
	      String fileDownloadUri = ServletUriComponentsBuilder
	          .fromCurrentContextPath()
	          .path("/list/")
	          .path(dbFile.getId())
	          .toUriString();
	      return new ResponseFile(
	          dbFile.getName(),
	          fileDownloadUri,
	          dbFile.getType(),
	          dbFile.getData().length);
	    }).collect(Collectors.toList());
	    return ResponseEntity.status(HttpStatus.OK).body(files);
	  }
	
	@GetMapping("/list/{id}")
	  public ResponseEntity<byte[]> getFile(@PathVariable String id) {
	    AssessmentFile fileDB = assessmentFileService.getFile(id);
	    return ResponseEntity.ok()
	        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileDB.getName() + "\"")
	        .body(fileDB.getData());
	  }

}

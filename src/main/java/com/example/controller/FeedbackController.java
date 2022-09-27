package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.converter.FeedbackDtoConverter;
import com.example.entity.Feedback;
import com.example.service.FeedbackService;

import dto.FeedbackDto;

@RestController
@CrossOrigin(origins="*")
public class FeedbackController {
	
	@Autowired
	private FeedbackService feedbackService;
	@Autowired FeedbackDtoConverter converter;
	
	@PostMapping("/feedback")
	public FeedbackDto addFeedback(@RequestBody FeedbackDto feedbackDto) {
		Feedback feedback = converter.dtoToEntity(feedbackDto);
		feedback = feedbackService.addFeedback(feedback);
		return converter.entityToDto(feedback);
	}
	
	
	@GetMapping("/feedback/{courseId}")
	public List<Feedback> getFeedbackById(@PathVariable int courseId){
		return feedbackService.getFeedbackById(courseId);
	}

}

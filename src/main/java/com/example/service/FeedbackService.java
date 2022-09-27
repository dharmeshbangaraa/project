package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Feedback;
import com.example.repo.FeedbackRepository;

@Service
public class FeedbackService {
	
	@Autowired
	private FeedbackRepository feedbackRepository;
	
	public Feedback addFeedback(Feedback feedback) {
		return feedbackRepository.save(feedback);
	}
	
	public List<Feedback> getFeedbackById(int courseId){
		return feedbackRepository.getAllFeedbackById(courseId);
	}
		

}

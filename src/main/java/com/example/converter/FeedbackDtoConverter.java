package com.example.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.entity.Feedback;

import dto.FeedbackDto;

@Component
public class FeedbackDtoConverter {
	
	public FeedbackDto entityToDto(Feedback feedback) {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(feedback, FeedbackDto.class);
	}
	
	
	public Feedback dtoToEntity(FeedbackDto feedbackDto) {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(feedbackDto, Feedback.class);
	}
	
	public List<FeedbackDto> entityToDto(List<Feedback> feedback){
		return feedback.stream().map(this::entityToDto).collect(Collectors.toList());
	}
	
	public List<Feedback> dtoToEntity(List<FeedbackDto> feedbackDto){
		return feedbackDto.stream().map(this::dtoToEntity).collect(Collectors.toList());
	}

}

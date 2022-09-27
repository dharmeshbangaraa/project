package com.example.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.entity.Courses;

import dto.CourseDto;

@Component
public class DtoConverter {

	public CourseDto entityToDto(Courses course) {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(course, CourseDto.class);
	}
	
	
	public Courses dtoToEntity(CourseDto courseDto) {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(courseDto, Courses.class);
	}
	
	public List<CourseDto> entityToDto(List<Courses> courses){
		return courses.stream().map(this::entityToDto).collect(Collectors.toList());
	}
	
	public List<Courses> dtoToEntity(List<CourseDto> coursesDto){
		return coursesDto.stream().map(this::dtoToEntity).collect(Collectors.toList());
	}
	
	
	
	
}

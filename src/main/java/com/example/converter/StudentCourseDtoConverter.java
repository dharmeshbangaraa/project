package com.example.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.entity.StudentCourses;

import dto.StudentCourseDto;

@Component
public class StudentCourseDtoConverter {

	public StudentCourseDto entityToDto(StudentCourses studentcourse) {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(studentcourse, StudentCourseDto.class);
	}
	
	
	public StudentCourses dtoToEntity(StudentCourseDto studentcourseDto) {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(studentcourseDto, StudentCourses.class);
	}
	
	public List<StudentCourseDto> entityToDto(List<StudentCourses> studentcourse){
		return studentcourse.stream().map(this::entityToDto).collect(Collectors.toList());
	}
	
	public List<StudentCourses> dtoToEntity(List<StudentCourseDto> studentcourseDto){
		return studentcourseDto.stream().map(this::dtoToEntity).collect(Collectors.toList());
	}
	
}

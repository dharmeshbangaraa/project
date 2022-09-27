package com.example.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.entity.StudentHasCourses;

import dto.StudentHasCoursesDto;

@Component
public class StudentHasCoursesDtoConverter {

	public StudentHasCoursesDto entityToDto(StudentHasCourses studentHasCourses) {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(studentHasCourses, StudentHasCoursesDto.class);
	}
	
	
	public StudentHasCourses dtoToEntity(StudentHasCoursesDto studentHasCoursesDto) {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(studentHasCoursesDto, StudentHasCourses.class);
	}
	
	public List<StudentHasCoursesDto> entityToDto(List<StudentHasCourses> studentHasCourses){
		return studentHasCourses.stream().map(this::entityToDto).collect(Collectors.toList());
	}
	
	public List<StudentHasCourses> dtoToEntity(List<StudentHasCoursesDto> studentHasCoursesDto){
		return studentHasCoursesDto.stream().map(this::dtoToEntity).collect(Collectors.toList());
	}
}

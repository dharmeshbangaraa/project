package com.example.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.entity.StudentLogin;

import dto.StudentLoginDto;

@Component
public class StudentLoginDtoConverter {
	
	public StudentLoginDto entityToDto(StudentLogin student) {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(student, StudentLoginDto.class);
	}
	
	
	public StudentLogin dtoToEntity(StudentLoginDto studentLoginDto) {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(studentLoginDto, StudentLogin.class);
	}
	
	public List<StudentLoginDto> entityToDto(List<StudentLogin> student){
		return student.stream().map(this::entityToDto).collect(Collectors.toList());
	}
	
	public List<StudentLogin> dtoToEntity(List<StudentLoginDto> studentLoginDto){
		return studentLoginDto.stream().map(this::dtoToEntity).collect(Collectors.toList());
	}
}

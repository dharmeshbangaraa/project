package com.example.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.entity.StudentRegistration;

import dto.StudentRegistrationDto;

@Component
public class StudentRegistrationDtoConverter {
	
	public StudentRegistrationDto entityToDto(StudentRegistration student) {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(student, StudentRegistrationDto.class);
	}
	
	
	public StudentRegistration dtoToEntity(StudentRegistrationDto studentRegistrationDto) {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(studentRegistrationDto, StudentRegistration.class);
	}
	
	public List<StudentRegistrationDto> entityToDto(List<StudentRegistration> student){
		return student.stream().map(this::entityToDto).collect(Collectors.toList());
	}
	
	public List<StudentRegistration> dtoToEntity(List<StudentRegistrationDto> studentRegistrationDto){
		return studentRegistrationDto.stream().map(this::dtoToEntity).collect(Collectors.toList());
	}

}

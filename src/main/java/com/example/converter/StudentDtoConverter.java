package com.example.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.entity.Student;

import dto.StudentDto;

@Component
public class StudentDtoConverter {
	
	public StudentDto entityToDto(Student student) {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(student, StudentDto.class);
	}
	
	
	public Student dtoToEntity(StudentDto studentDto) {
		ModelMapper mapper = new ModelMapper();
		return mapper.map(studentDto, Student.class);
	}
	
	public List<StudentDto> entityToDto(List<Student> student){
		return student.stream().map(this::entityToDto).collect(Collectors.toList());
	}
	
	public List<Student> dtoToEntity(List<StudentDto> studentDto){
		return studentDto.stream().map(this::dtoToEntity).collect(Collectors.toList());
	}
}

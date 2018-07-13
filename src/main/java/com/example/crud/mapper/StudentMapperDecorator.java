package com.example.crud.mapper;

import com.example.crud.entities.StudentEntity;
import com.example.crud.model.StudentModel;

public class StudentMapperDecorator implements StudentMapper {

	private final StudentMapper delegate;

	public StudentMapperDecorator(StudentMapper delegate) {
		this.delegate = delegate;
	}

	@Override
	public StudentEntity composeStudentEntity(StudentModel studentModel) {
		StudentEntity studentEntity = delegate.composeStudentEntity(studentModel);
		return studentEntity;
	}
}

package com.example.crud.services;

import java.util.List;
import java.util.Optional;

import com.example.crud.entities.StudentEntity;
import com.example.crud.model.StudentModel;

public interface StudentService {

	public Optional<StudentEntity> persistStudent(StudentModel student);

	public Optional<StudentEntity> obtainStudent(Integer id);
	
	public Optional<List<StudentEntity>> obtainStudentList();

	public void deleteStudent(Integer id);

	public Optional<StudentEntity> putStudent(StudentEntity student);

	public Optional<StudentEntity> modifyStudent(StudentEntity student);
}

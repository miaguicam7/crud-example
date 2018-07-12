package com.example.crud.services;

import java.util.List;
import java.util.Optional;

import com.example.crud.entities.Student;

public interface StudentService {

	public Optional<Student> persistStudent(Student student);

	public Optional<Student> obtainStudent(Integer id);
	
	public Optional<List<Student>> obtainStudentList();

	public void deleteStudent(Integer id);

	public Optional<Student> putStudent(Student student);

	public Optional<Student> modifyStudent(Student student);
}

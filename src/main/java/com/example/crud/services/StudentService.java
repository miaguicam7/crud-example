package com.example.crud.services;

import com.example.crud.entities.Student;

public interface StudentService {

	public Student persistStudent(Student student);

	public Student obtainStudent(Integer id);
	
	public void deleteStudent(Integer id);
	
	public Student modifyStudent(Student student);
}

package com.example.crud.services;

import java.util.Optional;

import com.example.crud.entities.Student;

public interface StudentService {

	public Student persistStudent(Student student);

	public Optional<Student> obtainStudent(Integer id);

	public void deleteStudent(Integer id);

	public Student putStudent(Student student);

	public Student modifyStudent(Student student);
}

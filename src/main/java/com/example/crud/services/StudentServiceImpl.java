package com.example.crud.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.DAO.StudentDAO;
import com.example.crud.entities.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDAO studentDAO;

	@Override
	public Student persistStudent(Student student) {
		return studentDAO.save(student);
	}

	@Override
	public Optional<Student> obtainStudent(Integer id) {
		return studentDAO.findById(id);
	}

	@Override
	public void deleteStudent(Integer id) {
		studentDAO.deleteById(id);
	}

	@Override
	public Student modifyStudent(Student student) {
		return studentDAO.save(student);
	}

	@Override
	public Student putStudent(Student student) {
		return studentDAO.save(student);
	}
}

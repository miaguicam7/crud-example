package com.example.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.DAO.StudentDAO;
import com.example.crud.entities.StudentEntity;
import com.example.crud.mapper.StudentMapper;
import com.example.crud.model.StudentModel;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;

	@Autowired
	private StudentMapper studentMapper;

	@Override
	public Optional<StudentEntity> persistStudent(StudentModel student) {
		return Optional.of(studentDAO.save(studentMapper.composeStudentEntity(student)));
	}

	@Override
	public Optional<StudentEntity> obtainStudent(Integer id) {
		return studentDAO.findById(id);
	}

	@Override
	public void deleteStudent(Integer id) {
		studentDAO.deleteById(id);
	}

	@Override
	public Optional<StudentEntity> modifyStudent(StudentEntity student) {
		return Optional.of(studentDAO.save(student));
	}

	@Override
	public Optional<StudentEntity> putStudent(StudentEntity student) {
		return Optional.of(studentDAO.save(student));
	}

	@Override
	public Optional<List<StudentEntity>> obtainStudentList() {
		return Optional.of(studentDAO.findAll());
	}
}

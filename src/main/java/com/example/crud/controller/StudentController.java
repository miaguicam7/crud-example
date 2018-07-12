package com.example.crud.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.entities.Student;
import com.example.crud.services.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	@RequestMapping(value = "/students", method = RequestMethod.POST)
	public ResponseEntity<?> persistStudent(@RequestBody Student student) {
		studentService.persistStudent(student);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/students/{student_id}", method = RequestMethod.GET)
	public ResponseEntity<?> obtainStudent(@PathVariable("student_id") Integer studentId) {
		Optional<Student> student = studentService.obtainStudent(studentId);

		if (student.isPresent()) {
			return new ResponseEntity<>(student.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}

	@RequestMapping(value = "/students/{student_id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteStudent(@PathVariable("student_id") Integer studentId) {
		studentService.deleteStudent(studentId);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/students", method = RequestMethod.PATCH)
	public ResponseEntity<?> modifyStudent(@RequestBody Student student) {
		studentService.modifyStudent(student);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}

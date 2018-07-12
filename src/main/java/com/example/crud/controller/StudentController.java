package com.example.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public ResponseEntity<?> persistStudent(@RequestBody Student student) {
		
		studentService.persistStudent(student);
		
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
}

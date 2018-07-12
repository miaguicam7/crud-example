package com.example.crud.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.crud.DAO.StudentDAO;

@ActiveProfiles(profiles = "develop")
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentDAOTest {

	@Autowired
	StudentDAO studentDAO;

	@Test
	public void persistUser() {

		//studentDAO.save(new Student().studentName("Manolo").rollNumber(45).course("primero"));
	}

}

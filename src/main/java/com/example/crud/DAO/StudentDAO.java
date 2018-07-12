package com.example.crud.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.entities.Student;

@Repository
public interface StudentDAO extends JpaRepository<Student, Integer>{
}

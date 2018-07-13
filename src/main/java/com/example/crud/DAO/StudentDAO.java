package com.example.crud.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.entities.StudentEntity;

@Repository
public interface StudentDAO extends JpaRepository<StudentEntity, Integer>{
}

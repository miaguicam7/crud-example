package com.example.crud.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;


@Entity
@Table(name="student")
@Accessors(chain = true, fluent = true)
@Data
@ToString
public class Student implements Serializable{
	private static final long serialVersionUID = -7826014622957055945L;
	
	@Id
	@Column(name="student_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="student_name")
	private String studentName;

	@Column(name="roll_number")
	private int rollNumber;

	@Column(name="course")
	private String course;
}

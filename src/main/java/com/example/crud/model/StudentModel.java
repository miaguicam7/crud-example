package com.example.crud.model;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true, fluent = true)
@ToString
public class StudentModel {

	private int id;

	private String name;

	private String course;

	private int role;
}

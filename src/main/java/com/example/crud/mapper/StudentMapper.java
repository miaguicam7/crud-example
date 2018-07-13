package com.example.crud.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.example.crud.entities.StudentEntity;
import com.example.crud.model.StudentModel;

//@Mapper
public interface StudentMapper {
	
	StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);
	 
	  @Mappings({
	      @Mapping(target="employeeId", source="entity.id"),
			@Mapping(target = "employeeName", source="entity.name")
	    })
	    StudentEntity composeStudentEntity(StudentModel studentModel);
}

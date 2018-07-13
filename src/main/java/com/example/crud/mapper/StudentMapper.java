package com.example.crud.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.example.crud.entities.StudentEntity;
import com.example.crud.model.StudentModel;

@Mapper(componentModel = "spring")
public interface StudentMapper {

	StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

	@Mappings({ @Mapping(target = "id", source = "studentModel.id"),
			@Mapping(target = "studentName", source = "studentModel.name"),
			@Mapping(target = "course", source = "studentModel.course"),
			@Mapping(target = "rollNumber", source = "studentModel.rollNumber"),

	})
	StudentEntity composeStudentEntity(StudentModel studentModel);
}

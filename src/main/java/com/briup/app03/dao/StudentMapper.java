package com.briup.app03.dao;

import java.util.List;

import com.briup.app03.bean.Student;

public interface StudentMapper {
	List<Student> findAll();
	
	Student findById(long id);
	
	void deleteById(long id);
	
	void insert(Student student);
	
	void update(Student student);
}

package com.briup.app03.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app03.bean.Student;
import com.briup.app03.dao.StudentMapper;
import com.briup.app03.service.IStudentService;


@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentMapper studentMapper;

	@Override
	public List<Student> findAll() throws Exception {
		List<Student> list = studentMapper.findAll();
		if (list != null) {
			return list;
		}
		else{
			throw new Exception("没有查找到数据");
		}

	}

	@Override
	public Student findById(long id) throws Exception {
		Student student = studentMapper.findById(id);
		if (student != null) {
			return student;
		}
		else{
			throw new Exception("没有查找到数据");
		}
	}

	@Override
	public void deleteById(long id) throws Exception {
		studentMapper.deleteById(id);
		
	}

	@Override
	public void insert(Student student) throws Exception {
		studentMapper.insert(student);
		
	}

	@Override
	public void update(Student student) throws Exception {
		studentMapper.update(student);
				
	}

}

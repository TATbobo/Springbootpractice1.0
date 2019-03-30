package com.briup.app03.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app03.bean.Student;
import com.briup.app03.service.IStudentService;

@RestController
@RequestMapping("/student")
public class studentController {
	
	@Autowired
	private IStudentService studentService;
	/**
	 * 查找所有学生信息
	 * @author Administrator
	 * @param student
	 * @return Student
	 */
	@GetMapping("findAllStudent")
	public List<Student> findAllStudnt() throws Exception{
		List<Student> list=studentService.findAll();
		return list;
	}
	
	@GetMapping("findStudentById")
	public Student findStudentById(long id) throws Exception{
		Student student=studentService.findById(id);
		return student;
	}
	
	@GetMapping("deleteById")
	public String deleteById(long id) throws Exception{
		try {
			studentService.deleteById(id);;
			return "删除成功";
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
		
	}
	
	@GetMapping("insert")
	public String insert(Student student) throws Exception{
		try {
			studentService.insert(student);
			return "插入成功";
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}
	
	
	@PostMapping("update")
	public String update(Student student) throws Exception{
		try {
			studentService.update(student);
			return "修改成功";
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}
}

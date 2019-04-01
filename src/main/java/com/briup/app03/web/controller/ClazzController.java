package com.briup.app03.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app03.bean.Clazz;
import com.briup.app03.service.IClazzService;

@RestController
@RequestMapping("/clazz")
public class ClazzController {
	
	@Autowired
	private IClazzService clazzService;
	
	@GetMapping("findAll")
	public List<Clazz> findAllClazz() throws Exception{
		List<Clazz> list = clazzService.findAll();
		return list;
	}
}

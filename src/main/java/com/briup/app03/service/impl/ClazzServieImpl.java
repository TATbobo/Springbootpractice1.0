package com.briup.app03.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app03.bean.Clazz;
import com.briup.app03.dao.ClazzMapper;
import com.briup.app03.service.IClazzService;

@Service
public class ClazzServieImpl implements IClazzService {

	@Autowired
	private ClazzMapper clazzmapper;
	
	public List<Clazz> findAll() throws Exception{
		List<Clazz> list = clazzmapper.findAll();
		if(list!=null){
			return list;
		}else{
			throw new Exception("数据库中查询不到任何数据");
			}
		}
	}



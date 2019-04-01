package com.briup.app03.dao;

import java.util.List;

import com.briup.app03.bean.Clazz;

public interface ClazzMapper {
	List<Clazz> findAll();
	Clazz findById(long id);
	void deleteById(long id);
	void insert(Clazz clazz);
	void update(Clazz clazz);
}

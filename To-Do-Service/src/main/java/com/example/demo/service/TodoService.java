package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Todo;

public interface TodoService {

	List<Todo> findAll();
	
	Todo findById(Integer id);
	
	void save(Todo todo);
	
	void delete(Integer id);
}

package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Todo;
import com.example.demo.repo.TodoRepo;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class TodoServiceImpl implements TodoService{
	private TodoRepo todoRepo;
	@Override
	public List<Todo> findAll() {
		// TODO Auto-generated method stub
		
		return todoRepo.findAll();
	}

	@Override
	public Todo findById(Integer id) {
		// TODO Auto-generated method stub
		return todoRepo.findById(id).get();
	}

	@Override
	public void save(Todo todo) {
		// TODO Auto-generated method stub
		todoRepo.save(todo);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		todoRepo.deleteById(id);
		
	}

}

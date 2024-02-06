package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Todo;
import com.example.demo.service.TodoService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/todoList")
public class TodoController {
	
	private TodoService todoService;
	
	@GetMapping("/getList")
	public List<Todo> getAllToDoList() {
		return todoService.findAll();
	}
	
	@PostMapping("/save")
	public void insertTodo(@RequestBody Todo todo) {
		todoService.save(todo);
	}
	
	@DeleteMapping("/delete")
	public void deleteTodo(@RequestParam("id") Integer id) {
		todoService.delete(id);
	}
	
	@PutMapping("/putToDo")
	void uptadeTodo(@RequestBody Todo todo) throws Exception {
		Todo temp= todoService.findById(todo.getTodoIdl());
		if(temp==null) {
			throw new Exception("Id not found");
		}
		else {
			todoService.save(todo);
		}		
	}
	
}

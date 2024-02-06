package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "todo_list")
public class Todo {
	@Id
	@Column(name = "todo_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer todoIdl;
	
	
	@JsonProperty
	@Column(name = "is_completed")
	private boolean isCompleted;
	
	@Column(name = "completion_date")
	private String completionDate;
	
	@Column(name = "todo_name")
	private Todoname todoname;
}

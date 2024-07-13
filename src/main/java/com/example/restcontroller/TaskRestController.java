package com.example.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Task;
import com.example.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskRestController {

	@Autowired
	private TaskService service;

	@PostMapping(value = "/task", produces = "application/json", consumes = "application/json")
	public ResponseEntity<Task> createTask(@RequestBody Task task) {
		Task task2 = service.createTask(task);
		return new ResponseEntity<>(task2, HttpStatus.CREATED);
	}

	@PostMapping(value = "/batch", produces = "application/json", consumes = "application/json")
	public ResponseEntity<List<Task>> createTasks(@RequestBody List<Task> tasks) {
		List<Task> tasksa = service.createTasks(tasks);
		return new ResponseEntity<>(tasksa, HttpStatus.CREATED);

	}

	@GetMapping(value = "/{id}", produces = "application/json")
	public ResponseEntity<Task> getTaskById(@PathVariable("id") Integer id) {
		Task taskById = service.getTaskById(id);
		return new ResponseEntity<>(taskById, HttpStatus.OK);
	}

	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Task>> getAllTask() {
		List<Task> allTasks = service.getAllTasks();
		return new ResponseEntity<>(allTasks, HttpStatus.OK);
	}

}

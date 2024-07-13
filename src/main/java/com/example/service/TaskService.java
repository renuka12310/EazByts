package com.example.service;

import java.util.List;

import com.example.entity.Task;

public interface TaskService {

	// create Task
	public Task createTask(Task task);

	// create Task
	public List<Task> createTasks(List<Task> tasks);

	// getTask by id
	public Task getTaskById(Integer id);

	// get all Task
	public List<Task> getAllTasks();

	// update Task
	public Task updateTask();

	// delete Task
	public Task deleteTask();

}

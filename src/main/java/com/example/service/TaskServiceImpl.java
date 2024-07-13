package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Task;
import com.example.repo.TaskRepo;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskRepo repo;

	@Override
	public Task createTask(Task task) {

		Task save = repo.save(task);
		return save;
	}

	@Override
	public List<Task> createTasks(List<Task> tasks) {
		return repo.saveAll(tasks);
	}

	@Override
	public Task getTaskById(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Task> getAllTasks() {
		return repo.findAll();
	}

	@Override
	public Task updateTask() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Task deleteTask() {
		// TODO Auto-generated method stub
		return null;
	}

	

}

package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Task;

public interface TaskRepo extends JpaRepository<Task, Integer> {

}

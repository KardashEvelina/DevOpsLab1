package com.example.devopslab1.repository;

import com.example.devopslab1.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

package com.rikkei.task_management.controller;

import com.rikkei.task_management.model.Task;
import com.rikkei.task_management.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    public List<Task> findAllTasks() {
        return taskService.findAllTasks();
    }
}
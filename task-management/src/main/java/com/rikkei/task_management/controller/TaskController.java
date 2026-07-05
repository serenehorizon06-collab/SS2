package com.rikkei.task_management.controller;

import com.rikkei.task_management.model.Task;
import com.rikkei.task_management.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    public ResponseEntity<List<Task>> findAllTasks(
            @RequestParam(required = false) String search) {

        List<Task> tasks = taskService.findAllTasks();

        if (search != null && !search.isEmpty()) {
            tasks = tasks.stream()
                    .filter(task -> task.getTitle()
                            .toLowerCase()
                            .contains(search.toLowerCase()))
                    .collect(Collectors.toList());
        }

        return ResponseEntity.ok(tasks);
    }

    @PostMapping("/tasks")
    public ResponseEntity<?> createTask(@RequestBody Task newTask) {
        Task savedTask = taskService.createTask(newTask);

        if (savedTask == null) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("User assignedTo không tồn tại");
        }

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedTask);
    }
}
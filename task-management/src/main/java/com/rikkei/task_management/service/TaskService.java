package com.rikkei.task_management.service;

import com.rikkei.task_management.model.Task;
import com.rikkei.task_management.model.User;
import com.rikkei.task_management.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;
    private final UserService userService;

    @Autowired
    public TaskService(TaskRepository taskRepository, UserService userService) {
        this.taskRepository = taskRepository;
        this.userService = userService;
    }

    public List<Task> findAllTasks() {
        return taskRepository.findAll();
    }

    public Task createTask(Task newTask) {
        User user = userService.findUserById(newTask.getAssignedTo());

        if (user == null) {
            return null;
        }

        return taskRepository.save(newTask);
    }
}
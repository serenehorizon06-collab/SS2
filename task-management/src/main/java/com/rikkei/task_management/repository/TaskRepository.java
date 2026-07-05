package com.rikkei.task_management.repository;

import com.rikkei.task_management.model.Task;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskRepository {

    private final List<Task> tasks = List.of(
            new Task(1L, "Học Spring Boot", "Làm quen với Spring Boot", "high", 1L),
            new Task(2L, "Làm bài tập Java", "Ôn lại OOP", "medium", 1L),
            new Task(3L, "Thiết kế API", "Viết file design.md", "high", 2L),
            new Task(4L, "Tạo Controller", "Tạo UserController", "low", 2L),
            new Task(5L, "Tạo Service", "Tạo UserService", "medium", 3L),
            new Task(6L, "Tạo Repository", "Tạo UserRepository", "high", 3L),
            new Task(7L, "Test API", "Kiểm tra bằng browser hoặc Postman", "high", 1L),
            new Task(8L, "Viết tài liệu", "Ghi chú cách chạy project", "low", 2L),
            new Task(9L, "Sửa lỗi", "Fix lỗi nếu có", "medium", 3L),
            new Task(10L, "Nộp bài", "Hoàn thiện và nộp bài", "high", 1L)
    );

    public List<Task> findAll() {
        return tasks;
    }
}
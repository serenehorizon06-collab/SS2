package com.rikkei.task_management.model;

public class Task {
    private Long id;
    private String title;
    private String description;
    private String priority;
    private Long assignedTo;

    public Task(Long id, String title, String description, String priority, Long assignedTo) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.assignedTo = assignedTo;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }

    public Long getAssignedTo() {
        return assignedTo;
    }
}
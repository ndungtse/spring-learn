package com.example.taskify.controllers;

import com.example.taskify.services.TaskService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.taskify.models.Task;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;

@RequestMapping("api/v1/students")
@RestController
@AllArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @GetMapping
    public List<Task> getAllTasks() {
        try {
            return taskService.getAllTasks();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}

package com.example.taskify.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.taskify.models.Task;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;

@RequestMapping("api/v1/students")
@RestController
@AllArgsConstructor
public class TaskController {
    
    // @GetMapping
    // public List<Task> getAllTasks() {
    //     List<Task> tasks = {};
    //     return tasks;
    // }
}

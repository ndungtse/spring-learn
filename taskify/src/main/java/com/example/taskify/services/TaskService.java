package com.example.taskify.services;

import com.example.taskify.models.Task;
import com.example.taskify.repositories.TaskRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Service
public class TaskService {
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
    public void createTask(String name, String description, Date toBeCompletedOn) {
        taskRepository.insert(new Task(name, description, toBeCompletedOn));
    }

    public void updateTask(String id, String name, String description) {
        Task task = taskRepository.findById(id).get();
        task.setTaskText(name);
        task.setDescription(description);
        taskRepository.save(task);
    }
    public void deleteTask(String id) {
        taskRepository.deleteById(id);
    }
}

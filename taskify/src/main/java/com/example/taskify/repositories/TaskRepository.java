package com.example.taskify.repositories;

import com.example.taskify.models.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, String> {
    
}

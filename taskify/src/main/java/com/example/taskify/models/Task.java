package com.example.taskify.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Task {
    @Id
    private String id;
    private String taskText;
    private boolean isCompleted;
    private Date toBeCompletedOn;

    public Task(String taskText, boolean isCompleted, Date toBeCompletedOn) {
        this.taskText = taskText;
        this.isCompleted = isCompleted;
        this.toBeCompletedOn = toBeCompletedOn;
    }

}

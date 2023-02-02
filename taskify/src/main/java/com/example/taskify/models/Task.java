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
    private String description;
    private boolean isCompleted;
    private Date toBeCompletedOn;

    public Task(String taskText, String description, Date toBeCompletedOn) {
        this.taskText = taskText;
        this.description = description;
        this.toBeCompletedOn = toBeCompletedOn;
    }

    public Task() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskText() {
        return taskText;
    }

    public void setTaskText(String taskText) {
        this.taskText = taskText;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public Date getToBeCompletedOn() {
        return toBeCompletedOn;
    }

    public void setToBeCompletedOn(Date toBeCompletedOn) {
        this.toBeCompletedOn = toBeCompletedOn;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

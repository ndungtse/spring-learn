package com.example.taskify.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.taskify.models.GroceryItem;
import com.example.taskify.models.Student;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RequestMapping("api/v1/students")
@RestController
@AllArgsConstructor
public class StudentController {

    @GetMapping
    public List<GroceryItem> fetchAllStudents() {
        GroceryItem grocery = new GroceryItem("id", "name", 12, "category");
        List<GroceryItem> groceries = List.of(grocery);
        return groceries;
    }

    @PostMapping(value="/")
    public void addGrocery(@RequestBody GroceryItem entity) {
        //TODO: process POST request
        
    }
    
}

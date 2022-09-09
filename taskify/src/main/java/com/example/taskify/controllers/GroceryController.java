package com.example.taskify.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.taskify.models.GroceryItem;
import com.example.taskify.services.GroceryService;

import lombok.AllArgsConstructor;

@RequestMapping("api/v1/groceries")
@RestController
@AllArgsConstructor
public class GroceryController {
    final GroceryService groceryService;
    
    @GetMapping
    public List<GroceryItem> getAllGroceries(){
        return groceryService.getAllGroceries();
    }

    @PostMapping
    public void addGrocery(@RequestBody GroceryItem grocery) {
        groceryService.insertGrocery(grocery);
    }
}

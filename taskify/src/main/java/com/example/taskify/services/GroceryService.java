package com.example.taskify.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.taskify.models.GroceryItem;
import com.example.taskify.repositories.GroceryRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class GroceryService {
    private GroceryRepository groceryRepository;

    public List<GroceryItem> getAllGroceries() {
        return groceryRepository.findAll();
    }

    public void insertGrocery(GroceryItem item) {
        groceryRepository.insert(item);
    }
}

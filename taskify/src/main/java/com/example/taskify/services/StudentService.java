package com.example.taskify.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import com.example.taskify.models.Student;
import com.example.taskify.repositories.StudentRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class StudentService {

    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}

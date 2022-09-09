package com.example.taskify.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.taskify.models.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
//    Optional<Student> findStudentByEmail(String email);
}
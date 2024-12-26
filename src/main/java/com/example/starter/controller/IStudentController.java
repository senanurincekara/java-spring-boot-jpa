package com.example.starter.controller;

import com.example.starter.entites.Student;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IStudentController {



    Student saveStudent(@RequestBody Student student);

    List<Student> getAllStudents();

    //id si şu olan öğrenciyi getir
    Student getStudentById(Integer id);


    void deleteStudent(Integer id);

    public Student updateStudent(Integer id , Student updatedStudent);
}

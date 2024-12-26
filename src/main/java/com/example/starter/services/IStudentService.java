package com.example.starter.services;

import com.example.starter.entites.Student;

import java.util.List;

public interface IStudentService {

    public Student saveStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(Integer id);

    void deleteStudentById(Integer id);

    Student updateStudent(Integer id, Student updatedStudent);
}

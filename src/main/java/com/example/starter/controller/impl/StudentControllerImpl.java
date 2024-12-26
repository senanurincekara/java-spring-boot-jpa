package com.example.starter.controller.impl;

import com.example.starter.controller.IStudentController;
import com.example.starter.entites.Student;
import com.example.starter.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController {

    @Autowired
    private IStudentService studentService;

    @PostMapping(path = "/save")

    @Override
    public Student saveStudent(@RequestBody Student student){
        return  studentService.saveStudent(student);
    }

    @GetMapping(path = "/list")
    @Override
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }




    //id si şu olan öğrenciyi getir
    @GetMapping(path = "/list-by-id/{id}")
    @Override
    public Student getStudentById(@PathVariable(name="id") Integer id){

        return studentService.getStudentById(id);
    }


    @DeleteMapping(path = "/delete-student/{id}")
    @Override
    public void deleteStudent(@PathVariable(name="id") Integer id){
        studentService.deleteStudentById(id);
    }

    @PutMapping(path = "/update-student/{id}")
    @Override
    public Student updateStudent(@PathVariable(name="id") Integer id, @RequestBody Student updatedStudent) {
        return studentService.updateStudent(id,updatedStudent);
    }


}

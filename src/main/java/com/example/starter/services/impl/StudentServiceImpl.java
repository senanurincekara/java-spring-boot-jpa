package com.example.starter.services.impl;

import com.example.starter.entites.Student;
import com.example.starter.repository.StudentRepository;
import com.example.starter.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
       return studentRepository.save(student);

    }

    @Override
    public List<Student> getAllStudents(){
        List<Student> studentList = studentRepository.findAll();
        return  studentList;
    }


    @Override
    public Student getStudentById(Integer id){
        Optional<Student> findStudent = studentRepository.findById(id);
        if(!findStudent.isEmpty()){
            return findStudent.get();
        }
        return null;
    }


    @Override
    public void deleteStudentById(Integer id){
        Student dbStudent = getStudentById(id);

        if(dbStudent != null){
            studentRepository.delete(dbStudent);
        }


    }



    @Override
    public Student updateStudent(Integer id, Student updatedStudent){
       Student dbStudent = getStudentById(id);
       if(dbStudent != null){
           dbStudent.setFirstName(updatedStudent.getFirstName());
           dbStudent.setLastName(updatedStudent.getLastName());
           dbStudent.setBirthOfDate(updatedStudent.getBirthOfDate());

           return studentRepository.save(dbStudent);
       }
        return null;
    }


}

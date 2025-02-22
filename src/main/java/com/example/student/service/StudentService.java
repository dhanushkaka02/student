package com.example.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.entity.Student;
import com.example.student.repo.StudentRepo;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public Student getStudentByName(String name)
    {
        return studentRepo.findByName(name);
    } 
    public String save(Student student)
    {
        studentRepo.save(student);
        return "saved succesfully"+student.getName();
    }

}

package com.example.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.entity.Student;
import com.example.student.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentService studentService;
    @GetMapping("/")
    public String display()
    {
        return "<h1>this is h1</h1>";
    }
    @GetMapping("/student")
    public Student getStudentByName(@RequestParam("name") String Name) {
        return studentService.getStudentByName(Name);
    }
    
    @PostMapping("/student")
    public String added(@RequestBody Student student)
    {
        return studentService.save(student);
        
    }

}

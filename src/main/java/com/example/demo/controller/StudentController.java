package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class StudentController {
    private final StudentService studentService;

    StudentController(StudentService studentService){
        this.studentService=studentService;
    }


    @PostMapping(value = "/add/student")
    public Student addStudent(@RequestBody Student student) {
        log.info("Adding student :: {} ", student);
        return studentService.addStudent(student);
    }

}

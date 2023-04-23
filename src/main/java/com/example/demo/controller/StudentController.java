package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/students")
    public List<Student> getStudents(){
       List<Student> studentList =  studentService.getStudent();
        return studentList;
    }

    @PutMapping("/update/student/{id}")
    public Student updateStudent(@PathVariable Long id , @RequestBody Student student){
        return studentService.updateStudent(id,student);
    }

}

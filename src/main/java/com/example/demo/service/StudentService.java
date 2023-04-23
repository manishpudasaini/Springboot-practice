package com.example.demo.service;

import com.example.demo.entity.Student;
import org.springframework.aop.target.LazyInitTargetSource;

import java.util.List;

public interface StudentService {
    public Student addStudent(Student std);
    List<Student> getStudent();
    Student updateStudent(Long id, Student student);
}

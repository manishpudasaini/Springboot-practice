package com.example.demo.service.implementation;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImp(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @Override
    public Student addStudent(Student std) {
        std.setStd_name(std.getStd_name());
        std.setStd_address(std.getStd_address());
        std.setStd_phone(std.getStd_phone());
        return std;
    }

}

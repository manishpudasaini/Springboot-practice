package com.example.demo.service.implementation;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        studentRepository.save(std);
        return std;
    }

    @Override
    public List<Student> getStudent() {
       List<Student> studentsList =  studentRepository.findAll();
        return studentsList;
    }

    @Override
    public Student updateStudent(Long id, Student student) {
       Optional<Student> oneStudent = studentRepository.findById(id);
        Student student1 = oneStudent.get();
        student1.setStd_name(student.getStd_name());
        student1.setStd_address(student.getStd_address());
        student1.setStd_phone(student.getStd_phone());

        studentRepository.save(student1);
        return student1;
    }

}

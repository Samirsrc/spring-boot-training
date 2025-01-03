package com.example.SpringJDBCEx.service;

import com.example.SpringJDBCEx.model.Student;
import com.example.SpringJDBCEx.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository studentRepo;
    public void addStudent(Student s) {
        System.out.println("Added");
        studentRepo.save(s);
    }

    public StudentRepository getStudentRepo() {
        return studentRepo;
    }
@Autowired
    public void setStudentRepo(StudentRepository studentRepo) {
        this.studentRepo = studentRepo;
    }

    public List<Student> getStudents() {
        return getStudentRepo().findAll();
    }
}

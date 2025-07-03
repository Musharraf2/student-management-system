package com.example.studentmanagement.services;

import com.example.studentmanagement.entity.student;

import java.util.List;

public interface StudentService {
    student addStudent(student student);
    List<student> getAllStudents();
    student getStudentById(Long id);
    student updateStudent(Long id,student student);
    void deleteStudent(Long id);
}

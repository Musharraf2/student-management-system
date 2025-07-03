package com.example.studentmanagement.controller;

import com.example.studentmanagement.entity.student;
import com.example.studentmanagement.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public student addStudent(@RequestBody student student){
        return studentService.addStudent(student);
    }

    @GetMapping
    public List<student>getAllStudents(){
        return studentService.getAllStudents();
    }

    @PutMapping("/{id}")
    public student updateStudent(@PathVariable Long id, @RequestBody student student) {
        return studentService.updateStudent(id,student);
    }
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "Student with ID " + id + " deleted.";
    }
    @GetMapping("/")
    public String hello() {
        return "Spring Boot is working!";
    }
}

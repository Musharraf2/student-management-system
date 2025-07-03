package com.example.studentmanagement.services;

import com.example.studentmanagement.entity.student;
import com.example.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public student addStudent(student student){
        return studentRepository.save(student);
    }

    @Override
    public List<student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public student updateStudent(Long id, student student) {
        student existing = studentRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(student.getName());
            existing.setEmail(student.getEmail());
            existing.setCourse(student.getCourse());
            return studentRepository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}

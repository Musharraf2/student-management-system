package com.example.studentmanagement.repository;

import com.example.studentmanagement.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<student,Long> {
}

package com.example.demo.Repository;

import com.example.demo.Entity.Student;
import com.example.demo.Entity.StudentScore;
import com.example.demo.Entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentScoreRepository extends JpaRepository<StudentScore, Long> {
    StudentScore findByStudentAndSubject(Student student, Subject subject);
}

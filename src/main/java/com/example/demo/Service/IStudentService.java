package com.example.demo.Service;

import com.example.demo.Models.CreateScoreStudent;
import com.example.demo.Models.CreateStudent;
import com.example.demo.dtos.StudentDTO;
import com.example.demo.dtos.StudentInfomation;
import com.example.demo.dtos.StudentScoreDTO;

import java.util.List;

public interface IStudentService {
    List<StudentInfomation> getInfomationStudents();
    StudentDTO create(CreateStudent model);
    StudentScoreDTO insertScore(CreateScoreStudent model);
}

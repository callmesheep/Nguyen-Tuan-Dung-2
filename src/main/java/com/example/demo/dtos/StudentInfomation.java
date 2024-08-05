package com.example.demo.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentInfomation {
    private Long id;

    private String studentCode;

    private String fullName;

    private List<SubjectScore> subjectScoreList;
}
package com.example.demo.Models;

import lombok.Data;

@Data
public class CreateScoreStudent {
    private Long studentId;
    private Long subjectId;
    private Double score1;
    private Double score2;
}

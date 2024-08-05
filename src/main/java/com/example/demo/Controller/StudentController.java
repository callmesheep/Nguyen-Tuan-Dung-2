package com.example.demo.Controller;

import com.example.demo.Models.CreateScoreStudent;
import com.example.demo.Models.CreateStudent;
import com.example.demo.Service.IStudentService;
import com.example.demo.dtos.ResponseObject;
import com.example.demo.dtos.StudentDTO;
import com.example.demo.dtos.StudentInfomation;
import com.example.demo.dtos.StudentScoreDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @GetMapping("")
    ResponseEntity<ResponseObject> getAll() {
        try {
            List<StudentInfomation> list = studentService.getInfomationStudents();
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ResponseObject(true, "ok", list)
            );
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new ResponseObject(false, e.getMessage(), "")
            );
        }
    }

    @PostMapping("")
    ResponseEntity<ResponseObject> insertStudent(@RequestBody CreateStudent createStudent) {
        try {
            StudentDTO studentDTO = studentService.create(createStudent);
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ResponseObject(true, "ok", studentDTO)
            );
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new ResponseObject(false, e.getMessage(), "")
            );
        }
    }

    @PostMapping("/score")
    ResponseEntity<ResponseObject> insertScoreStudent(@RequestBody CreateScoreStudent createScoreStudent) {
        try {
            StudentScoreDTO studentScoreDTO = studentService.insertScore(createScoreStudent);
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ResponseObject(true, "ok", studentScoreDTO)
            );
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new ResponseObject(false, e.getMessage(), "")
            );
        }
    }
}

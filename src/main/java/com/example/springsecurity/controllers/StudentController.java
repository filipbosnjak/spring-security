package com.example.springsecurity.controllers;

import com.example.springsecurity.data.entity.Student;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "James Bond"),
            new Student(2, "Maria Jones"),
            new Student(3, "Anna Smith")
    );

    @GetMapping
    public ResponseEntity<String> studentRoot() {
        return ResponseEntity.status(200).body("student root");
    }

    @GetMapping(path = "{studentId}")
    public ResponseEntity<Student> getStudent(@PathVariable("studentId") Integer studentId) {
        return ResponseEntity
                .status(200)
                .body(
                    STUDENTS.stream()
                    .filter(student -> studentId.equals(student.getStudentId()))
                    .findFirst()
                    .orElseThrow(() -> new IllegalStateException(
                            "Student " + studentId + " does not exists"
                ))
        );
    }
}

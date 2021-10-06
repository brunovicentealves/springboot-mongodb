package br.com.bruno.mongodb.controllers;

import br.com.bruno.mongodb.model.StudentRequest;
import br.com.bruno.mongodb.model.StudentResponse;
import br.com.bruno.mongodb.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentServiceImpl service;

    @PostMapping
    public ResponseEntity<StudentResponse> create(@RequestBody StudentRequest studentRequest){
        return ResponseEntity.ok(service.create(studentRequest));
    }

    @GetMapping
    public ResponseEntity<List<StudentResponse>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

}

package br.com.bruno.mongodb.service;

import br.com.bruno.mongodb.model.StudentRequest;
import br.com.bruno.mongodb.model.StudentResponse;

import java.util.List;

public interface StudentInterface {

    StudentResponse create (StudentRequest request);
    List<StudentResponse> getAll();


}

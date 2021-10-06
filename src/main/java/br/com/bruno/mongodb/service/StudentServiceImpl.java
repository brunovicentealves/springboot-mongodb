package br.com.bruno.mongodb.service;

import br.com.bruno.mongodb.entity.Student;
import br.com.bruno.mongodb.model.StudentRequest;
import br.com.bruno.mongodb.model.StudentResponse;
import br.com.bruno.mongodb.repository.StudentyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StudentServiceImpl implements StudentInterface {

    @Autowired
    private StudentyRepository repository;

    @Override
    public StudentResponse create(StudentRequest request) {
        Student student = new Student();
        student.setName(request.getName());
        student.setBirthDate(request.getBirthDate());
        student.setDocument(request.getDocument());
        student.setSecondKey(UUID.randomUUID());

        repository.save(student);
        return new StudentResponse(student);
    }

    @Override
    public List<StudentResponse> getAll() {

        List<StudentResponse> reponses = new ArrayList<>();
        List<Student> studentList = repository.findAll();

        if(!studentList.isEmpty()){
            studentList.forEach( student -> reponses.add(new StudentResponse(student)));
        }

        return reponses;
    }
}

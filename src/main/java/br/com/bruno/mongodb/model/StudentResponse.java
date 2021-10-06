package br.com.bruno.mongodb.model;

import br.com.bruno.mongodb.entity.Student;

import java.time.LocalDate;
import java.util.UUID;

public class StudentResponse {

    private String id;
    private String name;
    private UUID secondKey;
    private LocalDate birthDate;
    private String document;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public UUID getSecondKey() {
        return secondKey;
    }

    public void setSecondKey(UUID secondKey) {
        this.secondKey = secondKey;
    }

    public StudentResponse(Student student) {
        this.id = student.getId();
        this.name = student.getName();
        this.birthDate = student.getBirthDate();
        this.document = student.getDocument();
        this.secondKey=student.getSecondKey();
    }
}

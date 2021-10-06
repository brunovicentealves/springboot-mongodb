package br.com.bruno.mongodb.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.UUID;

@Document
public class Student {

    @Id
    private String id;
    private UUID secondKey;
    private String name;
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

    public void setSecondKey(UUID secondKey) {
        this.secondKey = secondKey;
    }

    public UUID getSecondKey() {
        return secondKey;
    }
}

package br.com.bruno.mongodb.repository;

import br.com.bruno.mongodb.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentyRepository extends MongoRepository<Student,String> {
}

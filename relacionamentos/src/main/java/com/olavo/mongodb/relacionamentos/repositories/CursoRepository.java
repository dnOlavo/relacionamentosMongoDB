package com.olavo.mongodb.relacionamentos.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.olavo.mongodb.relacionamentos.models.Curso;

@Repository
public interface CursoRepository extends MongoRepository<Curso, String> {
    
}


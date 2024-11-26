package com.olavo.mongodb.relacionamentos.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.olavo.mongodb.relacionamentos.models.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    
}


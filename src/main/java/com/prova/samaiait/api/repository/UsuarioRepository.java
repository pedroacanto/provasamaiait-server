package com.prova.samaiait.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prova.samaiait.api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}

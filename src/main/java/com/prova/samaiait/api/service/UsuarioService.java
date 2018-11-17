package com.prova.samaiait.api.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prova.samaiait.api.model.Usuario;
import com.prova.samaiait.api.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario atualizar(Long id, @Valid Usuario usuario) {		
		Optional<Usuario> usuarioSalvo = usuarioRepository.findById(id);
		BeanUtils.copyProperties(usuario, usuarioSalvo.get(), "id");
		return usuarioRepository.save(usuarioSalvo .get());
	}

}

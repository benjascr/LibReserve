package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Usuario;
import com.example.demo.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	public Optional<Usuario> findById(int id) {
		return repository.findById(id);
	}
	
	public Usuario findByCorreo(String correo) {
        return repository.findByCorreo(correo);
    }
	
	public boolean exist(int id) {
		return repository.existsById(id);
	}

	public List<Usuario> findAll() {
		return repository.findAll();
	}

	public void save(Usuario user) {
		repository.save(user);
	}

	public void delete(int id) {
		repository.deleteById(id);
	}
}
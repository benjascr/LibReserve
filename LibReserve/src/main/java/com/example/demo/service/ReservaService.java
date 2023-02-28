package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Reserva;
import com.example.demo.models.Usuario;
import com.example.demo.repositories.ReservaRepository;

@Service
public class ReservaService {

	@Autowired
	private ReservaRepository repository;

	public Optional<Reserva> findById(int id) {
		return repository.findById(id);
	}

	public List<Reserva> findAll() {
		return repository.findAll();
	}

	public void save(Reserva reserva) {
		repository.save(reserva);
	}

	public void delete(int id) {
		repository.deleteById(id);
	}
	
	public List<Reserva> reservasDelUsuario(Usuario usuario) {
        return repository.findByUsuario(usuario);
    }
}
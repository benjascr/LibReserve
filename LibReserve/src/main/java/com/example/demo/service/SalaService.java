package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Reserva;
import com.example.demo.models.Sala;
import com.example.demo.repositories.ReservaRepository;
import com.example.demo.repositories.SalaRepository;

@Service
public class SalaService {

	@Autowired
	private SalaRepository repository;
	
	@Autowired
	private ReservaRepository reservaRepository;

	public Optional<Sala> findById(int id) {
		return repository.findById(id);
	}
	
	public boolean exist(int id) {
		return repository.existsById(id);
	}

	public List<Sala> findAll() {
		return repository.findAll();
	}

	public void save(Sala sala) {
		repository.save(sala);
	}
	
    public void deleteSalaById(int id) {
        Optional<Sala> optionalSala = repository.findById(id);
        if (optionalSala.isPresent()) {
            Sala sala = optionalSala.get();
            List<Reserva> reservas = reservaRepository.findBySala(sala);
            reservaRepository.deleteAll(reservas);
            repository.delete(sala);
        }
    }
}
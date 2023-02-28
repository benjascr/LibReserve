package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Puesto_lectura;
import com.example.demo.models.Reserva;
import com.example.demo.models.Sala;
import com.example.demo.repositories.PuestoLecturaRepository;
import com.example.demo.repositories.ReservaRepository;

@Service
public class PuestoLecturaService {

	@Autowired
	private PuestoLecturaRepository repository;
	
	@Autowired
	private ReservaRepository reservaRepository;

	public Optional<Puesto_lectura> findById(int id) {
		return repository.findById(id);
	}
	
	public boolean exist(int id) {
		return repository.existsById(id);
	}

	public List<Puesto_lectura> findAll() {
		return repository.findAll();
	}

	public void save(Puesto_lectura puesto) {
		repository.save(puesto);
	}

	public void delete(int id) {
		repository.deleteById(id);
	}
	
	public void deletePuestoById(int id) {
        Optional<Puesto_lectura> optionalPuesto = repository.findById(id);
        if (optionalPuesto.isPresent()) {
            Puesto_lectura puesto = optionalPuesto.get();
            List<Reserva> reservas = reservaRepository.findByPuesto(puesto);
            reservaRepository.deleteAll(reservas);
            repository.delete(puesto);
        }
    }
}
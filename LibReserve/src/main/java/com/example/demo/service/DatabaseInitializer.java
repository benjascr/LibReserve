package com.example.demo.service;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Puesto_lectura;
import com.example.demo.models.Sala;
import com.example.demo.models.Usuario;
import com.example.demo.repositories.MensajeRepository;
import com.example.demo.repositories.SalaRepository;
import com.example.demo.repositories.UsuarioRepository;
import com.example.demo.repositories.PuestoLecturaRepository;
import com.example.demo.repositories.ReservaRepository;

@Service
public class DatabaseInitializer{

    @Autowired
    private SalaRepository salaRepository;
    
    @Autowired
    private MensajeRepository mensajeRepository;
    
    @Autowired
    private PuestoLecturaRepository puestoLecturaRepository;
    
    @Autowired
    private ReservaRepository reservaRepository;
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostConstruct
	public void init() throws IOException, URISyntaxException {

    	// Meter salas
    	Sala salaA = new Sala("Sala A", "Sala grupal", 2, true);
    	salaRepository.save(salaA);
    	Sala salaB = new Sala("Sala B", "Sala grupal", 2, true);
    	salaRepository.save(salaB);
    	Sala salaC = new Sala("Sala C", "Sala grupal", 2, true);
    	salaRepository.save(salaC);
    	
		// Meter puestos
    	Puesto_lectura puestoA = new Puesto_lectura("Puesto 1", "Puesto individual", true);
    	puestoLecturaRepository.save(puestoA);
    	Puesto_lectura puestoB = new Puesto_lectura("Puesto 2", "Puesto individual", true);
    	puestoLecturaRepository.save(puestoB);
    	Puesto_lectura puestoC = new Puesto_lectura("Puesto 3", "Puesto individual", true);
    	puestoLecturaRepository.save(puestoC);
    	
		// Meter usuarios
		usuarioRepository.save(new Usuario("Benja" , "Scrobota" , "benjabe6872@gmail.com" , "1234"));
		usuarioRepository.save(new Usuario("Administrador"));
	}
}

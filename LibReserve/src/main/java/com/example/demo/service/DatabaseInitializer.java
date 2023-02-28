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
    private PuestoLecturaRepository puestoLecturaRepository;
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostConstruct
	public void init() throws IOException, URISyntaxException {

    	salaRepository.deleteAll();
    	puestoLecturaRepository.deleteAll();
    	usuarioRepository.deleteAll();
    	
    	long numSalas = salaRepository.count();
    	if(numSalas == 0) {
	    	// Meter salas
	    	Sala salaA = new Sala("Sala 1", "Sala grupal", 2, true);
	    	salaRepository.save(salaA);
	    	Sala salaB = new Sala("Sala 2", "Sala grupal", 2, true);
	    	salaRepository.save(salaB);
	    	Sala salaC = new Sala("Sala 3", "Sala grupal", 2, true);
	    	salaRepository.save(salaC);
	    	Sala salaD = new Sala("Sala 4", "Sala grupal", 2, true);
	    	salaRepository.save(salaD);
	    	Sala salaE = new Sala("Sala 5", "Sala grupal", 2, true);
	    	salaRepository.save(salaE);
	    	Sala salaF = new Sala("Sala 6", "Sala grupal", 2, true);
	    	salaRepository.save(salaF);
    	}
    	
    	long numPuestos = puestoLecturaRepository.count();
    	if(numPuestos == 0) {
	    	// Meter puestos
	    	Puesto_lectura puestoA = new Puesto_lectura("Puesto 1", "Puesto individual", true);
	    	puestoLecturaRepository.save(puestoA);
	    	Puesto_lectura puestoB = new Puesto_lectura("Puesto 2", "Puesto individual", true);
	    	puestoLecturaRepository.save(puestoB);
	    	Puesto_lectura puestoC = new Puesto_lectura("Puesto 3", "Puesto individual", true);
	    	puestoLecturaRepository.save(puestoC);
	    	Puesto_lectura puestoD = new Puesto_lectura("Puesto 4", "Puesto individual", true);
	    	puestoLecturaRepository.save(puestoD);
	    	Puesto_lectura puestoE = new Puesto_lectura("Puesto 5", "Puesto individual", true);
	    	puestoLecturaRepository.save(puestoE);
	    	Puesto_lectura puestoF = new Puesto_lectura("Puesto 6", "Puesto individual", true);
	    	puestoLecturaRepository.save(puestoF);
    	}
    	
		// Meter usuarios
    	Usuario user = new Usuario("Benja" , "Scrobota" , "benjabe6872@gmail.com" , "1234");
		usuarioRepository.save(user);
		//Usuario admin = new Usuario("Administrador");
		//usuarioRepository.save(admin);
	}
}

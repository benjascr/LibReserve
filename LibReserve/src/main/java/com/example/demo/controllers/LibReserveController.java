package com.example.demo.controllers;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Puesto_lectura;
import com.example.demo.models.Reserva;
import com.example.demo.models.Sala;
import com.example.demo.models.Usuario;
import com.example.demo.service.PuestoLecturaService;
import com.example.demo.service.ReservaService;
import com.example.demo.service.SalaService;
import com.example.demo.service.UsuarioService;

@Controller
public class LibReserveController {
	
	@Autowired
	private SalaService salaService;
	
	@Autowired
	private PuestoLecturaService puestoService;
	
	@Autowired
	private UsuarioService usuarioService;

    @Autowired
    private ReservaService reservaService;

	
	@GetMapping("/home")
    public String home(Model model) {
        //model.addAttribute("universidad", "Universidad Rey Juan Carlos");

        return "home";
    }
	
	@GetMapping("/sala")
	public String salas(Model model) {
		model.addAttribute("salas", salaService.findAll());
		return "salas";
	}
	
	@GetMapping("/sala/{id}")
    public String verSala(Model model, @PathVariable int id) {
		
		Optional<Sala> sala = salaService.findById(id);
		if (sala.isPresent()) {
			model.addAttribute("sala", sala.get());
			return "sala";
		} else {
			return "salas";
		}
    }
	
	// Primero lo creo vacío
	@GetMapping("/nuevasala")
	public String nuevaSala(Model model) {
	    model.addAttribute("sala", new Sala());
	    return "nuevasala";
	}
	
	//Despues de rellenar form. guardo todo
	@PostMapping("/guardarSala")
	public String guardarSala(Model model, Sala sala) {
	    salaService.save(sala);
		model.addAttribute("salaId", sala.getId());
	    return "creado_satisfactoriamente_sala";
	}
	
	@GetMapping("/puesto")
	public String puestos(Model model) {
		model.addAttribute("puestos", puestoService.findAll());
		return "puestos";
	}
	
	@GetMapping("/puesto/{id}")
    public String verPuesto(Model model, @PathVariable int id) {
		
		Optional<Puesto_lectura> puesto = puestoService.findById(id);
		if (puesto.isPresent()) {
			model.addAttribute("puesto", puesto.get());
			return "puesto";
		} else {
			return "puestos";
		}
    }
	
	// Primero lo creo vacío
	@GetMapping("/nuevopuesto")
	public String nuevoPuesto(Model model) {
	    model.addAttribute("puesto", new Puesto_lectura());
	    return "nuevopuesto";
	}
	
	//Despues de rellenar form. guardo todo
	@PostMapping("/guardarPuesto")
	public String guardarPuesto(Model model, Puesto_lectura puesto) {
	    puestoService.save(puesto);
		model.addAttribute("puestoId", puesto.getId());
	    return "creado_satisfactoriamente_puesto";
	}
	
	@GetMapping("/perfil")
	public String mostrarDatosUsuario(Model model) {
		Usuario usuario = usuarioService.findByCorreo("benjabe6872@gmail.com");;
        List<Reserva> reservas = reservaService.reservasDelUsuario(usuario);
	    model.addAttribute("usuario", usuario);
	    model.addAttribute("reservas", reservas);
	    return "perfil";
	}
	
	
	@GetMapping("/sala/{id}/reservar")
	public String confirmarReserva(Model model, @PathVariable int id) {
	    Usuario usuario = usuarioService.findByCorreo("benjabe6872@gmail.com");
	    Optional<Sala> optionalSala = salaService.findById(id);
	    if (!optionalSala.isPresent()) {
	        // Si la sala no existe
	        return "sala";
	    }

	    Sala sala = optionalSala.get();
	    
	    if (sala.getDisponible() == false) {
	        // Si la sala no está disponible
	        return "nodisponible";
	    }

	    Date fechaActual = new Date();
	    Reserva reserva = new Reserva(fechaActual, fechaActual,usuario, sala);
	    reservaService.save(reserva);
	    
	    sala.setDisponible(false); 
	    salaService.save(sala);
	    
	    model.addAttribute("salaReservada", sala.getNombre());

	    return "salareservada";
	}
	
	@GetMapping("/sala/{id}/borrar")
	public String borrarSala(@PathVariable int id) {
	    Optional<Sala> optionalSala = salaService.findById(id);
	    if (!optionalSala.isPresent()) {
	        // Si la sala no existe
	        return "sala";
	    }

	    Sala sala = optionalSala.get();
	    salaService.deleteSalaById(sala.getId());
	    return "borrado_sala";
	}
	
	


}

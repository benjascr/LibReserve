package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SalaController {
	
	private String franjaHorariaSeleccionada = "";

	@GetMapping("/sala")
    public String home(Model model) {
        return "sala";
    }

	@PostMapping("/sala/{id}")
	public String confirmarSeleccionFranjaHoraria(@RequestParam("franjaHoraria") String franjaHoraria) {
		this.franjaHorariaSeleccionada = franjaHoraria;
	    return "confirmacionReserva";
	}
	
}

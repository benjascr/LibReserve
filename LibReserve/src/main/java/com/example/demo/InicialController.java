package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

	@GetMapping("/salute")
	public String salute(Model model) { // los metodos de un controladro devuelven String y reciben Model
		
		model.addAttribute("name", "World");
		
		return "salute";
	
	}
	
}

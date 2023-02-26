package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/error")
    public String error(Model model) {
        //model.addAttribute("universidad", "Universidad Rey Juan Carlos");

        return "home";
    }

	@GetMapping("/home")
    public String home(Model model) {
        //model.addAttribute("universidad", "Universidad Rey Juan Carlos");

        return "home";
    }

}

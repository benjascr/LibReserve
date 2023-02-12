package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import models.Usuario;
import repositories.UsuarioRepository;

@Controller
public class UsuarioController {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/user")
    public String mostrarUsuarios(Model model) {
    	
        return "usuarios";
    }

}
package com.muralkids.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Transformar a classe em um BIN adicionando a anotação Controller
@Controller
public class HomeController {

	// Método que abrirá a página HOME
	@GetMapping("/")
	public String home() {
		return "/home";
	}

}
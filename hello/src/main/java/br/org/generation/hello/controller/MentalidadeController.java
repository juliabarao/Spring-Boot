package br.org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mentalidades")
public class MentalidadeController {

	@GetMapping
	public String mentalidades() {
		return "Mentalidades utilizadas para realizar essa atividade: <br/>- Mentalidade de Crescimento <br/>- Persistência";
	}
}

package br.org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades")
public class HabilidadeController {

	@GetMapping
	public String habilidades() {
		return "Habilidades utilizadas para realizar essa atividade: <br/>- Trabalho em Equipe <br/>- Atenção aos Detalhes";
	}
}

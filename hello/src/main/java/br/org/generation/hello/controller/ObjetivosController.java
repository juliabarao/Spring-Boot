package br.org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {

	@GetMapping
	public String objetivos() {
		return " Meus objetivos para esta semana são de aprender e compreender cada detalhe da nossa primavera,"
				+ " e me dedicar inteiramente a Spring Boot por achar um dos conteudos mais difíceis"
				+ "	e não desistir com as dificuldades, persistindo e estar sempre atenta aos "
				+ "	detalhes e as novas fases dessa aprendizagem.";
	}
}

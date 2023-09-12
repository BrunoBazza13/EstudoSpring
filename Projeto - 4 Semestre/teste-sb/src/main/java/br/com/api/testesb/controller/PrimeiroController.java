package br.com.api.testesb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //mapeia a classe 
public class PrimeiroController {
	

//	// essa anotation mapeia uma requisição para este metodo
//	@RequestMapping(method = RequestMethod.GET) // propriedade method aponta pra um metodo do tipo get
//	public String Ola() {
//		return "Ola Spring boot";
//	}
	
	//essa anotation vai ser uma mapeamento para um metodo do tipo get
	@GetMapping(path = "/ola") // a propriedade path pode faz uma requisição apartir de outro caminho ex: /ola
	public String Ola() {
		return "eiiiddd brunoooouurrr";
	}
	
	
	
}

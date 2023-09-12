package br.com.api.testesb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	
	@GetMapping("/somar/{a}/{b}") //quando eu pesquisar essa url e passar um valor a e um valor b vou ter uma respostar apartir desse metodo
	public double soma(@PathVariable double a, @PathVariable double b) { // a partit dessa anotation o ele pega os valores da url e soma
		return a + b;
				
	}
	
	@GetMapping("/subtrair")
	public double subtrarir(@RequestParam(name = "a") double a,@RequestParam(name = "b") double b) { 
		return a * b;
	}
	
}

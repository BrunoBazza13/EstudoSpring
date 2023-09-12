package br.com.api.testesb.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("metodos")
@RestController
public class MetodosHttpController {

	@GetMapping  // obtem inf do servidor
	public String get() {
		return "Requisição Get";
	}

	@PostMapping // serva para enviar inf para o servidor 
	public String post() {
		return "Requisição Post";
	}

	@PatchMapping // serve para alterar dados parcialmente
	public String patch() {
		return "Requisição Patch";
	}

	@PutMapping // serve para fazer uma alteração total
	public String put() {
		return "Requisição Put";
	}

	@DeleteMapping // serve para deletar
	public String delete() {
		return "Requisição Delete";
	}

}

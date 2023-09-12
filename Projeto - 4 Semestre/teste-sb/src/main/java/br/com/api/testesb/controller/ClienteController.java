package br.com.api.testesb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.testesb.model.entidades.Cliente;

@RestController
@RequestMapping("/somar")
public class ClienteController {

	@GetMapping("/qualquer")
	public Cliente dadosCliente() {
		return new Cliente(01, "Bazza", "381.860.968-33");
	}
	
	@GetMapping("/{id}") // permite passar o id apartir de uma url para passar como parametro em seguida
	public Cliente obterClientesPorId(@PathVariable int id) { // essa anotation pega o valor passado na url
		return new Cliente(id, "Bruno", "381.860.968-33");
	}
	
	
}

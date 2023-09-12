package br.com.api.testesb.model.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Produtos {

	@Id // toda entidade precisa de um id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // isso signfica que o produto vai ter sua propria sequencia de
														// id unica
	// obs: essas anotações possuem estrategias diferentes...
	private int id;
	
	@NotBlank// valor tem que ser obrigatoriamente diferente de vazio
	private String nome;
	
	@Min(0)
	private double preco;
	
	@Min(0)
	@Max(1)
	private double desconto;
	
	public Produtos() {
		
	}
	
	public Produtos(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	
	
}

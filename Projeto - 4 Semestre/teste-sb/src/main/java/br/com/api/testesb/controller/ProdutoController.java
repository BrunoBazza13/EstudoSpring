package br.com.api.testesb.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.testesb.model.entidades.Produtos;
import br.com.api.testesb.model.repositorie.ProdutoRepository;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	
	@Autowired // ao usar essa notação o proprio spring coloca um OBJ no atributo
	private ProdutoRepository produtoRepository; // injeção de dependencia
	
	 @RequestMapping(method = {RequestMethod.PUT, RequestMethod.POST})
	public @ResponseBody Produtos novoProduto(@Valid Produtos produto) { // verifica se o produto é valido de acordo com as anotations
		//Produtos produto = new Produtos(nome, preco, desconto);
		produtoRepository.save( produto);// neste trecho esta sendo feio a persistencia de forma que ao add um novo elemento add corretamente	
		return produto;
	}
	
	@GetMapping
	public Iterable<Produtos> obterProdutos() { //retorna tds os produtos da tabela do banco de dados
		return produtoRepository.findAll(); // findAll retorna uma interface chamada interable
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Produtos> obterProdutoPorId(@PathVariable int id) {
		return produtoRepository.findById(id);	
	}
	
//	@PutMapping
//	public  @ResponseBody Produtos alteraProduto(@Valid Produtos produto) {
//		produtoRepository.save(produto);
//		return produto;
//	}

}

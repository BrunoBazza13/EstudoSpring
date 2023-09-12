package br.com.api.testesb.model.repositorie;

import org.springframework.data.repository.CrudRepository;


import br.com.api.testesb.model.entidades.Produtos;

public interface ProdutoRepository extends CrudRepository<Produtos, Integer> {

}

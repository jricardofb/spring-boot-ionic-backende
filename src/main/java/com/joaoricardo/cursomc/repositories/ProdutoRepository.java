package com.joaoricardo.cursomc.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.joaoricardo.cursomc.domain.Categoria;
import com.joaoricardo.cursomc.domain.Produto;

@Repository
public interface  ProdutoRepository extends JpaRepository<Produto, Integer> {

	// Consulta JPQL
	//@Query("SELECT DISTINCT obj FROM Produto obj INNER JOIN obj.categorias cat WHERE obj.nome LIKE %:nome% AND cat IN :categorias")
	
	@Transactional(readOnly = true) // Só uma consulta não precisa fazer nenhuma transação
	@Query("SELECT DISTINCT obj FROM Produto obj INNER JOIN obj.categorias cat WHERE obj.nome LIKE %:nome% AND cat IN :categorias")
	// Com o padrão Spring Data
	Page<Produto> findDistinctByNomeContaingAndCategoriasIn(String nome, List<Categoria> categorias, Pageable pageRequest);
}

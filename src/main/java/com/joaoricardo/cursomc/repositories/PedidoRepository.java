package com.joaoricardo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joaoricardo.cursomc.domain.Pedido;

@Repository
public interface  PedidoRepository extends JpaRepository<Pedido, Integer> {

		

}

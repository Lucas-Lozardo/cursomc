package com.lozardo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lozardo.cursomc.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}


///EXTENDS = HERDAR.
///COLOCADO INTEGER QUE SE REFERE A CATEGORIA DO ID.
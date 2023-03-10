package com.lozardo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lozardo.cursomc.domain.Pedido;
import com.lozardo.cursomc.repositories.PedidoRepository;
import com.lozardo.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired   ///AUTOMATICAMENTE INSTANCIADA PELO SPRING, PELA INJEÇÃO DE DEPENDENCIAS.
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
					"Objeto não encontrado! Id: " 
					+ id 
					+ ", Tipo: " 
					+ Pedido.class.getName()));
	}
}
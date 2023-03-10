package com.lozardo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lozardo.cursomc.domain.Cliente;
import com.lozardo.cursomc.repositories.ClienteRepository;
import com.lozardo.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired   ///AUTOMATICAMENTE INSTANCIADA PELO SPRING, PELA INJEÇÃO DE DEPENDENCIAS.
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
					"Objeto não encontrado! Id: " 
					+ id 
					+ ", Tipo: " 
					+ Cliente.class.getName()));
	}
}
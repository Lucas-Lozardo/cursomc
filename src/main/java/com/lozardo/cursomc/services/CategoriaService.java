package com.lozardo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lozardo.cursomc.domain.Categoria;
import com.lozardo.cursomc.repositories.CategoriaRepository;
import com.lozardo.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired   ///AUTOMATICAMENTE INSTANCIADA PELO SPRING, PELA INJEÇÃO DE DEPENDENCIAS.
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
					"Objeto não encontrado! Id: " 
					+ id 
					+ ", Tipo: " 
					+ Categoria.class.getName()));
	}
}


/* 
	ABAIXO CONFORME FOI APRESENTADO NO CURSO

	public Categoria buscar(Integer id){
	Categoria obj = repo.findOne(id);
	return obj;
*/
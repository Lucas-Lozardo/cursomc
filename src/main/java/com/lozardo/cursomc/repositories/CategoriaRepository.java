package com.lozardo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lozardo.cursomc.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}


///EXTENDS = HERDAR.
///COLOCADO INTEGER QUE SE REFERE A CATEGORIA DO ID.
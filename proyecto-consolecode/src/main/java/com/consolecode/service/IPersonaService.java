package com.consolecode.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.consolecode.model.Persona;

public interface IPersonaService {

	List<Persona> listar();
	Persona registrar(Persona persona);
	Persona actualizar(Persona persona);
	void eliminar(Integer codigo);
	Persona ListarPorId(Integer codigo);
	
	Page<Persona> listPageable(Pageable pageable);
	
}

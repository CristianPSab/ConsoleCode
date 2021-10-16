package com.consolecode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consolecode.model.Pais;
import com.consolecode.repository.IPaisRepository;
import com.consolecode.service.IPaisService;

@Service
public class PaisServiceImpl implements IPaisService{

	@Autowired
	IPaisRepository repo;
	
	@Override
	public List<Pais> listar() {
		return repo.findAll();
	}

	@Override
	public Pais registrar(Pais pais) {
		return repo.save(pais);
	}

	@Override
	public Pais actualizar(Pais pais) {
		return repo.save(pais);
	}

	@Override
	public void eliminar(Integer codigo) {
		repo.deleteById(codigo);
		
	}

	@Override
	public Pais ListarPorId(Integer codigo) {
		return repo.findById(codigo).orElse(null);
	}

}

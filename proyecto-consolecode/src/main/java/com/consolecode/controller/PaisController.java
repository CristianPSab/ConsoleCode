package com.consolecode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consolecode.model.Pais;

import com.consolecode.service.IPaisService;


@RestController
@RequestMapping("/pais")
public class PaisController {
	
	@Autowired
	IPaisService service;
	
	@GetMapping
	//public List<Pais> listar() {
	public ResponseEntity<List<Pais>> listar() {	//Buenas prácticas
		// return service.listar();
		List<Pais> obj = service.listar();
		return new ResponseEntity<List<Pais>>(obj, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Pais> registrar(@RequestBody Pais pais){
		Pais obj = service.registrar(pais);
		return new ResponseEntity<Pais> (obj, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Pais> actualizar(@RequestBody Pais pais){
		Pais obj = service.actualizar(pais);
		return new ResponseEntity<Pais> (obj, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception {
		Pais obj = service.ListarPorId(id);		
		if(obj == null) {
			throw new Exception("No se encontró ID");
		}
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	 
	@GetMapping("/{id}")
	public ResponseEntity<Pais> listarPorId(@PathVariable("id") Integer codigo)throws Exception {
		Pais obj = service.ListarPorId(codigo);		
		if(obj == null) {
			throw new Exception("No se encontró ID");
		}
		
		return new ResponseEntity<Pais>(obj, HttpStatus.OK);
	}
	

	
	
}

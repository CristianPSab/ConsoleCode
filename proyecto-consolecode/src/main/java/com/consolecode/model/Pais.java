package com.consolecode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pais {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdPais;
	
	@Column(name= "nombre", length= 50, nullable = false)
	private String nombre;

	/**
	 * @return the idPais
	 */
	public Integer getIdPais() {
		return IdPais;
	}

	/**
	 * @param idPais the idPais to set
	 */
	public void setIdPais(Integer idPais) {
		IdPais = idPais;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
}

package com.consolecode.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.consolecode.model.Persona;


@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Integer> {


	
	
	
}

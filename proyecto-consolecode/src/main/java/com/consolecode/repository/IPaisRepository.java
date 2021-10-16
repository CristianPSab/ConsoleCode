package com.consolecode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.consolecode.model.Pais;

@Repository
public interface IPaisRepository extends JpaRepository<Pais, Integer> {

}

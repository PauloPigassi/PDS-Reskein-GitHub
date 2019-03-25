package com.Reskein.PDSReskein.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Reskein.PDSReskein.model.Escola;


@Repository
public interface EscolaRepository extends JpaRepository<Escola, Integer> {
	

	@Query(value = "select * from Escola where idEscola=?", nativeQuery = true)
	List<Escola> findAllByIdEscola(Integer idEscola);
	
}

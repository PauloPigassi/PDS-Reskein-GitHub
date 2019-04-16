package com.Reskein.PDSReskein.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Reskein.PDSReskein.model.Escola;


@Repository
public interface EscolaRepository extends JpaRepository<Escola, Integer> {
	

	@Query(value = "select * from Escola where idEscola=?", nativeQuery = true)
	List<Escola> findAllByIdEscola(Integer idEscola);
	
	@Modifying
	@Transactional
	@Query("UPDATE Escola SET endereco = :endereco, nome = :nome WHERE idEscola = :idEscola")
	 public void update(@Param("endereco") String endereco, @Param("nome") String nome, @Param("idEscola") int idEscola); 
	
}

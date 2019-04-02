package com.Reskein.PDSReskein.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Reskein.PDSReskein.model.Aluno;


@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
	

	@Query(value = "select * from Aluno where idAluno=?", nativeQuery = true)
	List<Aluno> findAllByIdAluno(Integer idAluno);
	
	
	@Modifying
	@Transactional
	@Query("UPDATE Aluno SET endereco = :endereco, contato = :contato WHERE idAluno = :idAluno")
	 public void update(@Param("endereco") String endereco, @Param("contato") String contato, @Param("idAluno") int i) 
	
	
}

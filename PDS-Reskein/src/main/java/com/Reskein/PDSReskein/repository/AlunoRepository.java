package com.Reskein.PDSReskein.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Reskein.PDSReskein.model.Aluno;


@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
	

	@Query(value = "select * from Aluno where idAluno=?", nativeQuery = true)
	List<Aluno> findByIdAluno(Integer idAluno);
	
}

package com.Reskein.PDSReskein.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.Reskein.PDSReskein.model.Aluno;


@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
	List<Aluno> findByIdAluno(Integer idAluno);

	@Query(value = "select * from Aluno where idAluno=?", nativeQuery = true)
	List<Aluno> findAllByIdAluno(Integer id);
	
}

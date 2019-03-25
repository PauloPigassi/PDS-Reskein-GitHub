package com.Reskein.PDSReskein.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Reskein.PDSReskein.model.Evento;


@Repository
public interface EventoRepository extends JpaRepository<Evento, Integer> {
	

	@Query(value = "select * from Evento where idEvento=?", nativeQuery = true)
	List<Evento> findAllByIdEvento(Integer idEvento);
	
}

package com.Reskein.PDSReskein.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Reskein.PDSReskein.model.Turno;


@Repository
public interface TurnoRepository extends JpaRepository<Turno, Integer> {
	

	@Query(value = "select * from Turno where idTurno=?", nativeQuery = true)
	List<Turno> findAllByIdTurno(Integer idTurno);
	
}

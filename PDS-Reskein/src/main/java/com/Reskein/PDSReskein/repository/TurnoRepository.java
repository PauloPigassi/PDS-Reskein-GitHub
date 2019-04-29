package com.Reskein.PDSReskein.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Reskein.PDSReskein.model.Turno;


@Repository
public interface TurnoRepository extends JpaRepository<Turno, Integer> {
	

	@Query(value = "select * from Turno where idTurno=?", nativeQuery = true)
	List<Turno> findAllByIdTurno(Integer idTurno);
//	
//	@Modifying
//	@Transactional
//	@Query("UPDATE Turno SET horarioEntrada = :horarioEntrada, horarioSaida = :horarioSaida WHERE idTurno = :idTurno")
//	 public void update(@Param("horarioEntrada") Date horarioEntrada, @Param("horarioSaida") Date horarioSaida, @Param("idTurno") int idTurno); 
//	
	
}

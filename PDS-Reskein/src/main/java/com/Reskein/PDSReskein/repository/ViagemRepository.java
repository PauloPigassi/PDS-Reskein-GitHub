package com.Reskein.PDSReskein.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Reskein.PDSReskein.model.Viagem;


@Repository
public interface ViagemRepository extends JpaRepository<Viagem, Integer> {
	

	@Query(value = "select * from Viagem where idViagem=?", nativeQuery = true)
	List<Viagem> findAllByIdViagem(Integer idViagem);
	
	
//	@Modifying
//	@Transactional
//	@Query("UPDATE Viagem SET diaSemana = :diaSemana, idItineario = :idItinerario, periodo = :periodo, idTurno = :idTurno WHERE idViagem = :idViagem")
//	 public void update(@Param("diaSemana") String diaSemana, @Param("idItinerario") int idItinerario, @Param("periodo") String periodo, @Param("idTurno") int idTurno, @Param("idviagem") int idViagem); 
//	
	
	
	
}
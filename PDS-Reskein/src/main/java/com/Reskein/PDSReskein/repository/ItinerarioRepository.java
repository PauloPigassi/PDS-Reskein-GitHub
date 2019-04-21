package com.Reskein.PDSReskein.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Reskein.PDSReskein.model.Itinerario;


@Repository
public interface ItinerarioRepository extends JpaRepository<Itinerario, Integer> {
	

	@Query(value = "select * from Itinerario where idItinerario=?", nativeQuery = true)
	List<Itinerario> findAllByIdItinerario(Integer idItinerario);
	
	@Modifying
	@Transactional
	@Query("UPDATE Itinerario SET distancia = :distancia, idPerueiro = :idPerueiro, idAluno = :idAluno, idEscola = :idEscola WHERE idItinerario = :idItinerario")
	 public void update(@Param("distancia") Double distancia, @Param("idPerueiro") int idPerueiro, @Param("idAluno") int idAluno,@Param("idEscola") int idEscola, @Param("idItinerario") int idItinerario); 
	
}

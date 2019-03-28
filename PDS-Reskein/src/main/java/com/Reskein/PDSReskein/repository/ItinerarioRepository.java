package com.Reskein.PDSReskein.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Reskein.PDSReskein.model.Itinerario;


@Repository
public interface ItinerarioRepository extends JpaRepository<Itinerario, Integer> {
	

	@Query(value = "select * from Itinerario where idItinerario=?", nativeQuery = true)
	List<Itinerario> findAllByIdItinerario(Integer idItinerario);
	
}

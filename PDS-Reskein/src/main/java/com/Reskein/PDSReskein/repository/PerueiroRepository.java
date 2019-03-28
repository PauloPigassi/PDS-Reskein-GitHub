package com.Reskein.PDSReskein.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Reskein.PDSReskein.model.Perueiro;


@Repository
public interface PerueiroRepository extends JpaRepository<Perueiro, Integer> {
	

	@Query(value = "select * from Perueiro where idPerueiro=?", nativeQuery = true)
	List<Perueiro> findAllByIdPerueiro(Integer idPerueiro);
	
}

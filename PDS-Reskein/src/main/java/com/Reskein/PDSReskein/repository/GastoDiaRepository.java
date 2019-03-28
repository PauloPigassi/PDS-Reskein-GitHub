package com.Reskein.PDSReskein.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Reskein.PDSReskein.model.GastoDia;


@Repository
public interface GastoDiaRepository extends JpaRepository<GastoDia, Integer> {
	

	@Query(value = "select * from GastoDia where idGastoDia=?", nativeQuery = true)
	List<GastoDia> findAllByIdGastoDia(Integer idGastoDia);
	
}

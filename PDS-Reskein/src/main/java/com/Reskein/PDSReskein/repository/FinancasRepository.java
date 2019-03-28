package com.Reskein.PDSReskein.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Reskein.PDSReskein.model.Financa;


@Repository
public interface FinancaRepository extends JpaRepository<Financa, Integer> {
	

	@Query(value = "select * from Financa where idFinanca=?", nativeQuery = true)
	List<Financa> findAllByIdFinanca(Integer idFinanca);
	
}

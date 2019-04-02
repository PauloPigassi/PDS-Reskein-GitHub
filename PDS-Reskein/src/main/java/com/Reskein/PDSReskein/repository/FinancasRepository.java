package com.Reskein.PDSReskein.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Reskein.PDSReskein.model.Financas;


@Repository
public interface FinancasRepository extends JpaRepository<Financas, Integer> {
	

	@Query(value = "select * from Financa where idFinanca=?", nativeQuery = true)
	List<Financas> findAllByIdFinanca(Integer idFinanca);
	
}

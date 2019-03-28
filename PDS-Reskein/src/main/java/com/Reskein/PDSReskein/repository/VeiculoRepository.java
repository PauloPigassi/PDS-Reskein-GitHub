package com.Reskein.PDSReskein.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Reskein.PDSReskein.model.Veiculo;


@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Integer> {
	

	@Query(value = "select * from Veiculo where idVeiculo=?", nativeQuery = true)
	List<Veiculo> findAllByIdVeiculo(Integer idVeiculo);
	
}

package com.Reskein.PDSReskein.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Reskein.PDSReskein.model.Veiculo;


@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Integer> {
	

	@Modifying
	@Transactional
	@Query("UPDATE Veiculo SET modelo = :modelo, lugares = :lugares, kmPorLitro = :kmPorLitro WHERE idVeiculo = :idVeiculo")
	 public void update(@Param("modelo") String modelo, @Param("lugares") int lugares, @Param("kmPorLitro") double kmPorLitro, @Param("idVeiculo") int idVeiculo); 
	
	
	@Query(value = "select * from Veiculo where idVeiculo=?", nativeQuery = true)
	List<Veiculo> findAllByIdVeiculo(Integer idVeiculo);
	
	
}

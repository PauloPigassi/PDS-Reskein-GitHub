package com.Reskein.PDSReskein.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Reskein.PDSReskein.model.GastoDia;


@Repository
public interface GastoDiaRepository extends JpaRepository<GastoDia, Integer> {
	

	@Query(value = "select * from GastoDia where idGastoDia=?", nativeQuery = true)
	List<GastoDia> findAllByIdGastoDia(Integer idGastoDia);
	
	@Modifying
	@Transactional
	@Query("UPDATE GastoDia SET precoCombustivel = :precoCombustivel, diaAbastecimento = :diaAbastecimento, quantidadeCombustivel = :quantidadeCombustivel, kmPorLitro = :kmPorLitro WHERE idGastoDia = :idGastoDia")
	 public void update(@Param("precoCombustivel") Double precoCombustivel, @Param("diaAbastecimento") Date diaAbastecimento, @Param("quantidadeCombustivel") Double quantidadeCombustivel, @Param("kmPorLitro") Float kmPorLitro, @Param("idGastoDia") int idGastoDia); 
	
}

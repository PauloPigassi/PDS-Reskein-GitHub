package com.Reskein.PDSReskein.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Reskein.PDSReskein.model.GastoExtra;


@Repository
public interface GastoExtraRepository extends JpaRepository<GastoExtra, Integer> {
	

	@Query(value = "select * from GastoExtra where idGastoExtra=?", nativeQuery = true)
	List<GastoExtra> findAllByIdGastoExtra(Integer idGastoExtra);
	
	@Modifying
	@Transactional
	@Query("UPDATE GastoExtra SET descricao = :descricao, valor = :valor,  WHERE idGastoExtra = :idGastoExtra")
	 public void update(@Param("descricao") String descricao, @Param("valor") Double valor, @Param("idGastoExtra") int idGastoExtra); 
	
	
}

package com.Reskein.PDSReskein.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Reskein.PDSReskein.model.Financas;


@Repository
public interface FinancasRepository extends JpaRepository<Financas, Integer> {
	

	@Query(value = "select * from Financa where idFinanca=?", nativeQuery = true)
	List<Financas> findAllByIdFinanca(Integer idFinanca);
	
	@Modifying
	@Transactional
	@Query("UPDATE Financas SET mensalidade = :mensalidade, quantidadeAlunos = :quantidadeAlunos, idGastodia = :idGastoDia, idGastoExtra = :idGastoExtra WHERE idFinancas = :idFinancas")
	 public void update(@Param("mensalidade") Double mensalidade, @Param("quantidadeAlunos") int quantidadeAlunos, @Param("idGastoDia") int idGastoDia, @Param("idGastoExtra") int idGastoExtra, @Param("idFinancas") int idFinancas); 
	
	
}

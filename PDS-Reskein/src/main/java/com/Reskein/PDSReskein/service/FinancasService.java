package com.Reskein.PDSReskein.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Reskein.PDSReskein.model.Financas;
import com.Reskein.PDSReskein.model.Turno;
import com.Reskein.PDSReskein.repository.FinancasRepository;


@Service
public class FinancasService {
	
	@Autowired
	private FinancasRepository financasRepository;
	
	@Transactional
	public void salvarFinancas(Financas financas) {
		Optional<Financas> financasservice = financasRepository.findById(financas.getIdFinancas());
		financas.setIdFinancas(financasservice.get().getIdFinancas());
		financas.setMensalidade(financasservice.get().getMensalidade());
		financas.setIdGastoDia(financasservice.get().getIdGastoDia());
		financas.setIdGastoExtra(financasservice.get().getIdGastoExtra());
//		financas.setQuantidadealunos(financasservice.get().getQuantidadealunos());
		financas.setGastoDia(financasservice.get().getGastoDia());
		financas.setGastoExtra(financasservice.get().getGastoExtra());
		
		financasRepository.save(financas);
	}
	
	@Transactional
	public void excluirFinancas (Financas financas) {
		Optional<Financas> financasservice = financasRepository.findById(financas.getIdFinancas());
		financasRepository.delete(financas);
		
		
	}
	
	@Transactional
	public void editarFinancas(Financas financas) {
			financasRepository.update(financas.getMensalidade(), financas.getQuantidadeAlunos(), financas.getIdGastoDia(), financas.getIdGastoExtra(), financas.getIdFinancas());
		}
}

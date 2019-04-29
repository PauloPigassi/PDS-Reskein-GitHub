package com.Reskein.PDSReskein.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Reskein.PDSReskein.model.GastoDia;
import com.Reskein.PDSReskein.model.Turno;
import com.Reskein.PDSReskein.repository.GastoDiaRepository;


@Service
public class GastoDiaService {
	
	@Autowired
	private GastoDiaRepository gastoDiaRepository;
	
	@Transactional
	public void salvarGastoDia(GastoDia gastoDia) {
		Optional<GastoDia> gastoDiaservice = gastoDiaRepository.findById(gastoDia.getIdGastoDia());
		gastoDia.setIdGastoDia(gastoDiaservice.get().getIdGastoDia());
		gastoDia.setPrecoCombustivel(gastoDiaservice.get().getPrecoCombustivel());
		gastoDia.setDiaAbastecimento(gastoDiaservice.get().getDiaAbastecimento());
		gastoDia.setQuantidadeCombustivel(gastoDiaservice.get().getQuantidadeCombustivel());
		gastoDia.setKmPorLitro(gastoDiaservice.get().getKmPorLitro());
		gastoDia.setCustoDia(gastoDiaservice.get().getCustoDia());
		
		gastoDiaRepository.save(gastoDia);
	}
	
	@Transactional
	public void excluirGastoDia (GastoDia gastoDia) {
		Optional<GastoDia> gastoDiaservice = gastoDiaRepository.findById(gastoDia.getIdGastoDia());
		gastoDiaRepository.delete(gastoDia);
		
		
	}
	
//	@Transactional
//	public void editarGastoDia (GastoDia gastoDia) {
//			gastoDiaRepository.update(gastoDia.getPrecoCombustivel(), gastoDia.getDiaAbastecimento(),gastoDia.getQuantidadeCombustivel(),gastoDia.getKmPorLitro(), gastoDia.getIdGastoDia());
//		}
	
}

package com.Reskein.PDSReskein.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Reskein.PDSReskein.model.Aluno;
import com.Reskein.PDSReskein.model.Viagem;
import com.Reskein.PDSReskein.repository.ViagemRepository;


@Service
public class ViagemService {
	
	@Autowired
	private ViagemRepository viagemRepository;
	
	@Transactional
	public void salvarViagem(Viagem viagem) {
		Optional<Viagem> viagemservice = viagemRepository.findById(viagem.getIdViagem());
		viagem.setIdViagem(viagemservice.get().getIdViagem());
		viagem.setDiaSemana(viagemservice.get().getDiaSemana());
		viagem.setIdItinerario(viagemservice.get().getIdItinerario());
		viagem.setPeriodo(viagemservice.get().getPeriodo());
		viagem.setIdTurno(viagemservice.get().getIdTurno());
		
		viagemRepository.save(viagem);
	}
	
	
	@Transactional
	public void excluirViagem (Viagem viagem) {
		Optional<Viagem> viagemService = viagemRepository.findById(viagem.getIdViagem());
		viagemRepository.delete(viagem);
		
		
	}
	
//	@Transactional
//	public void editarViagem (Viagem viagem) {		
//			viagemRepository.update(viagem.getDiaSemana(), viagem.getIdItinerario(), viagem.getPeriodo(), viagem.getIdTurno(), viagem.getIdViagem());
//		}
	
	
	
}
package com.Reskein.PDSReskein.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Reskein.PDSReskein.model.Itinerario;
import com.Reskein.PDSReskein.model.Turno;
import com.Reskein.PDSReskein.repository.ItinerarioRepository;


@Service
public class ItinerarioService {
	
	@Autowired
	private ItinerarioRepository itinerarioRepository;
	
	@Transactional
	public void salvarItinerario(Itinerario itinerario) {
		Optional<Itinerario> itinerarioservice = itinerarioRepository.findById(itinerario.getIdItinerario());
		itinerario.setIdItinerario(itinerarioservice.get().getIdItinerario());
		itinerario.setDistancia(itinerarioservice.get().getDistancia());
		itinerario.setIdPerueiro(itinerarioservice.get().getIdPerueiro());
		itinerario.setIdAluno(itinerarioservice.get().getIdAluno());
		itinerario.setIdEscola(itinerarioservice.get().getIdEscola());
		itinerario.setPerueiro(itinerarioservice.get().getPerueiro());
		itinerario.setAluno(itinerarioservice.get().getAluno());
		itinerario.setEscola(itinerarioservice.get().getEscola());
		
		itinerarioRepository.save(itinerario);
	}
	
	@Transactional
	public void excluirItinerario (Itinerario itinerario) {
		Optional<Itinerario> itinerarioservice = itinerarioRepository.findById(itinerario.getIdItinerario());
		itinerarioRepository.delete(itinerario);
		
		
	}
	
	@Transactional
	public void editarItinerario (Itinerario itinerario) {
			itinerarioRepository.update(itinerario.getDistancia(), itinerario.getIdPerueiro(), itinerario.getIdAluno(), itinerario.getIdEscola(), itinerario.getIdItinerario());
		}
	
}

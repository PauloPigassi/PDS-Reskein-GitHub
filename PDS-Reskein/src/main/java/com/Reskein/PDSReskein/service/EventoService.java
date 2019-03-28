package com.Reskein.PDSReskein.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Reskein.PDSReskein.model.Evento;
import com.Reskein.PDSReskein.repository.EventoRepository;


@Service
public class EventoService {
	
	@Autowired
	private EventoRepository eventoRepository;
	
	@Transactional
	public void salvarEvento(Evento evento) {
		Optional<Evento> eventoservice = eventoRepository.findById(evento.getIdEvento());
		evento.setIdEvento(eventoservice.get().getIdEvento());
		evento.setDiaSemana(eventoservice.get().getDiaSemana());
		evento.setIdItinerario(eventoservice.get().getIdItinerario());
		evento.setPeriodo(eventoservice.get().getPeriodo());
		evento.setIdTurno(eventoservice.get().getIdTurno());
		
		eventoRepository.save(evento);
	}
	
}

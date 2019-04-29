package com.Reskein.PDSReskein.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Reskein.PDSReskein.model.Aluno;
import com.Reskein.PDSReskein.model.Turno;
import com.Reskein.PDSReskein.repository.TurnoRepository;


@Service
public class TurnoService {
	
	@Autowired
	private TurnoRepository turnoRepository;
	
	@Transactional
	public void salvarTurno(Turno turno) {
		Optional<Turno> turnoservice = turnoRepository.findById(turno.getIdTurno());
		turno.setIdTurno(turnoservice.get().getIdTurno());
		turno.setHorarioEntrada(turnoservice.get().getHorarioEntrada());
		turno.setHorarioSaida(turnoservice.get().getHorarioSaida());
		
		turnoRepository.save(turno);
	}
	@Transactional
	public void excluirTurno (Turno turno) {
		Optional<Turno> turnoservice = turnoRepository.findById(turno.getIdTurno());
		turnoRepository.delete(turno);
		
		
	}
	
//	@Transactional
//	public void editarTurno (Turno turno) {
//			turnoRepository.update(turno.getHorarioEntrada(), turno.getHorarioSaida(), turno.getIdTurno());
//		}
//	
	
}

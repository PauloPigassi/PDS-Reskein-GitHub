package com.Reskein.PDSReskein.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Reskein.PDSReskein.model.Escola;
import com.Reskein.PDSReskein.repository.EscolaRepository;


@Service
public class EscolaService {
	
	@Autowired
	private EscolaRepository fscolaRepository;
	
	@Transactional
	public void salvarEscola(Escola escola) {
		Optional<Escola> escolaservice = escolaRepository.findById(escola.getIdEscola());
		escola.setIdEscola(escolaservice.get().getIdEscola());
		escola.setEndereco(escolaservice.get().getEndereco());
		
		EscolaRepository.save(escola);
	}
	
}

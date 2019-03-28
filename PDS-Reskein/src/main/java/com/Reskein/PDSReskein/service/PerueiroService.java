package com.Reskein.PDSReskein.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Reskein.PDSReskein.model.Perueiro;
import com.Reskein.PDSReskein.repository.PerueiroRepository;


@Service
public class PerueiroService {
	
	@Autowired
	private PerueiroRepository perueiroRepository;
	
	@Transactional
	public void salvarPerueiro(Perueiro perueiro) {
		Optional<Perueiro> perueiroservice = perueiroRepository.findById(perueiro.getIdPerueiro());
		perueiro.setIdPerueiro(perueiroservice.get().getIdPerueiro());
		perueiro.setLogin(perueiroservice.get().getLogin());
		perueiro.setSenha(perueiroservice.get().getSenha());
		perueiro.setEndereco(perueiroservice.get().getEndereco());
		
		perueiroRepository.save(perueiro);
	}
	
}

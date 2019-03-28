package com.Reskein.PDSReskein.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Reskein.PDSReskein.model.Veiculo;
import com.Reskein.PDSReskein.repository.VeiculoRepository;


@Service
public class VeiculoService {
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@Transactional
	public void salvarVeiculo(Veiculo veiculo) {
		Optional<Veiculo> veiculoservice = veiculoRepository.findById(veiculo.getIdVeiculo());
		veiculo.setIdVeiculo(veiculoservice.get().getIdVeiculo());
		veiculo.setModelo(veiculoservice.get().getModelo());
		veiculo.setLugares(veiculoservice.get().getLugares());
		
		veiculoRepository.save(veiculo);
	}
	
}

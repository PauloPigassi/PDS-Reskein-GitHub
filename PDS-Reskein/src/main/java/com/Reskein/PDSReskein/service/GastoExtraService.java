package com.Reskein.PDSReskein.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Reskein.PDSReskein.model.GastoExtra;
import com.Reskein.PDSReskein.repository.GastoExtraRepository;


@Service
public class GastoExtraService {
	
	@Autowired
	private GastoExtraRepository gastoExtraRepository;
	
	@Transactional
	public void salvarGastoExtra(GastoExtra gastoExtra) {
		Optional<GastoExtra> gastoExtraservice = gastoExtraRepository.findById(gastoExtra.getIdGastoExtra());
		gastoExtra.setIdGastoExtra(gastoExtraservice.get().getIdGastoExtra());
		gastoExtra.setDescricao(gastoExtraservice.get().getDescricao());
		gastoExtra.setValor(gastoExtraservice.get().getValor());
		
		gastoExtraRepository.save(gastoExtra);
	}
	
}

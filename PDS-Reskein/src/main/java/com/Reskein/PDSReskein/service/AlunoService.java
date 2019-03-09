package com.Reskein.PDSReskein.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Reskein.PDSReskein.model.Aluno;
import com.Reskein.PDSReskein.repository.AlunoRepository;


@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Transactional
	public void salvarAluno(Aluno aluno) {
		Optional<Aluno> alunoservice = alunoRepository.findById(aluno.getIdAluno());
		aluno.setIdAluno(alunoservice.get().getIdAluno());
		aluno.setContato(alunoservice.get().getContato());
		aluno.setEndereco(alunoservice.get().getEndereco());
		
		alunoRepository.save(aluno);
	}
	
}

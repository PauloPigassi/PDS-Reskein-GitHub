package com.Reskein.PDSReskein.controller;

import java.net.URI;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.Reskein.PDSReskein.model.Turno;
import com.Reskein.PDSReskein.repository.TurnoRepository;
import com.Reskein.PDSReskein.service.TurnoService;


@Controller
@RequestMapping("/turno")
public class TurnoController {
	
	@Autowired
	private TurnoRepository turnoRepository;
	
	@Autowired
	private TurnoService turnoService;
	
	@GetMapping(value = "/mostrarTurnos")
	public ModelAndView turno(Turno turno) {
		ModelAndView mv = new ModelAndView("turno");
		
		mv.addObject("turno", turnoRepository.findAll());
		return mv;
	}
	
	
	@RequestMapping(value="/adicionarTurno",method=RequestMethod.POST)
	public ModelAndView adicionarTurno(@Valid Turno turno, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			return turno(turno);
		}
		turnoService.salvarTurno(turno);
		
		attributes.addFlashAttribute("mensagem", "Ocorrência cadastrada com sucesso!");
		return new ModelAndView("redirect:/turno/mostrarTurnos");
	}}
	
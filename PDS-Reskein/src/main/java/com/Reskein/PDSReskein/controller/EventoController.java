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

import com.Reskein.PDSReskein.model.Evento;
import com.Reskein.PDSReskein.repository.EventoRepository;
import com.Reskein.PDSReskein.service.EventoService;


@Controller
@RequestMapping("/evento")
public class EventoController {
	
	@Autowired
	private EventoRepository eventoRepository;
	
	@Autowired
	private EventoService eventoService;
	
	@GetMapping(value = "/mostrarEventos")
	public ModelAndView evento(Evento evento) {
		ModelAndView mv = new ModelAndView("evento");
		
		mv.addObject("evento", eventoRepository.findAll());
		return mv;
	}
	
	
	@RequestMapping(value="/adicionarEvento",method=RequestMethod.POST)
	public ModelAndView adicionarEvento(@Valid Evento evento, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			return evento(evento);
		}
		eventoService.salvarEvento(evento);
		
		attributes.addFlashAttribute("mensagem", "Ocorrência cadastrada com sucesso!");
		return new ModelAndView("redirect:/evento/mostrarEventos");
	}
}
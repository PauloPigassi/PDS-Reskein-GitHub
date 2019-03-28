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

import com.Reskein.PDSReskein.model.Itinerario;
import com.Reskein.PDSReskein.repository.ItinerarioRepository;
import com.Reskein.PDSReskein.service.ItinerarioService;


@Controller
@RequestMapping("/itinerario")
public class ItinerarioController {
	
	@Autowired
	private ItinerarioRepository itinerarioRepository;
	
	@Autowired
	private ItinerarioService itinerarioService;
	
	@GetMapping(value = "/mostrarItinerarios")
	public ModelAndView itinerario(Itinerario itinerario) {
		ModelAndView mv = new ModelAndView("itinerario");
		
		mv.addObject("itinerario", itinerarioRepository.findAll());
		return mv;
	}
	
	
	@RequestMapping(value="/adicionarItinerario",method=RequestMethod.POST)
	public ModelAndView adicionarItinerario(@Valid Itinerario itinerario, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			return itinerario(itinerario);
		}
		itinerarioService.salvarItinerario(itinerario);
		
		attributes.addFlashAttribute("mensagem", "Ocorrência cadastrada com sucesso!");
		return new ModelAndView("redirect:/itinerario/mostrarItinerarios");
	}
	
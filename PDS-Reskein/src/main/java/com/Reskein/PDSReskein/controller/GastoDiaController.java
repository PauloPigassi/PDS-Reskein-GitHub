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

import com.Reskein.PDSReskein.model.GastoDia;
import com.Reskein.PDSReskein.repository.GastoDiaRepository;
import com.Reskein.PDSReskein.service.GastoDiaService;


@Controller
@RequestMapping("/gastoDia")
public class GastoDiaController {
	
	@Autowired
	private GastoDiaRepository gastoDiaRepository;
	
	@Autowired
	private GastoDiaService gastoDiaService;
	
	@GetMapping(value = "/mostrarGastoDias")
	public ModelAndView gastoDia(GastoDia gastoDia) {
		ModelAndView mv = new ModelAndView("gastoDia");
		
		mv.addObject("gastoDia", gastoDiaRepository.findAll());
		return mv;
	}
	
	
	@RequestMapping(value="/adicionarGastoDia",method=RequestMethod.POST)
	public ModelAndView adicionarGastoDia(@Valid GastoDia gastoDia, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			return gastoDia(gastoDia);
		}
		gastoDiaService.salvarGastoDia(gastoDia);
		
		attributes.addFlashAttribute("mensagem", "Ocorrência cadastrada com sucesso!");
		return new ModelAndView("redirect:/gastoDia/mostrarGastoDias");
	}}
	
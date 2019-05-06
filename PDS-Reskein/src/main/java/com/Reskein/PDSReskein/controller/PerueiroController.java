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

import com.Reskein.PDSReskein.model.Perueiro;
import com.Reskein.PDSReskein.repository.PerueiroRepository;
import com.Reskein.PDSReskein.service.PerueiroService;


@Controller
@RequestMapping("/perueiro")
public class PerueiroController {
	
	@Autowired
	private PerueiroRepository perueiroRepository;

	@Autowired
	private PerueiroService perueiroService;
	
	@GetMapping(value = "/criarPerueiro")
	public ModelAndView criarPerueiro(Perueiro perueiro) {
		ModelAndView mv = new ModelAndView("criarPerueiro");

		return mv;
	}
	

	@GetMapping(value = "/mostrarPerueiros")
	public ModelAndView perueiro(Perueiro perueiro) {
		ModelAndView mv = new ModelAndView("visualizarPerueiro");

		mv.addObject("perueiro", perueiroRepository.findAll( ));
		return mv;
		
	}
	
	

	@RequestMapping(value = "/adicionarPerueiro", method = RequestMethod.POST)
	public ModelAndView adicionarPerueiro(@Valid Perueiro perueiro, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return perueiro(perueiro);
		}
		perueiroService.salvarPerueiro(perueiro);

		attributes.addFlashAttribute("mensagem", "Perueiro cadastrado com sucesso!");
		return new ModelAndView("redirect:/perueiro/criarPerueiro");
	}
	
//	@RequestMapping(value="/editarPerueiro", method=RequestMethod.POST)
//	public ModelAndView atualizarPerueiro(@Valid Perueiro perueiro, BindingResult result, RedirectAttributes attributes) {
//		if(result.hasErrors()) {
//			return perueiro(perueiro);
//		}
//		perueiroService.editarPerueiro(perueiro);
//		 
//		attributes.addFlashAttribute("mensagem", "Perueiro editado com sucesso!");
//		return new ModelAndView("redirect:/perueiro/mostrarPerueiros");
//	}

	@RequestMapping(value = "/excluirPerueiro", method = RequestMethod.POST)
	public ModelAndView excluirPerueiro(@Valid Perueiro perueiro, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return perueiro(perueiro);
		}
		perueiroService.excluirPerueiro(perueiro);

		attributes.addFlashAttribute("mensagem", "Perueiro removido com sucesso!");
		return new ModelAndView("redirect:/perueiro/mostrarPerueiros");
	}

}
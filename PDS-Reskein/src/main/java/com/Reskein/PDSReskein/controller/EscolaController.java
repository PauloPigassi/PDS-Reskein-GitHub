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

import com.Reskein.PDSReskein.model.Escola;
import com.Reskein.PDSReskein.model.Perueiro;
import com.Reskein.PDSReskein.repository.EscolaRepository;
import com.Reskein.PDSReskein.service.EscolaService;

@Controller
@RequestMapping("/escola")
public class EscolaController {

	@Autowired
	private EscolaRepository escolaRepository;

	@Autowired
	private EscolaService escolaService;
	
	@GetMapping(value = "/criarEscola")
	public ModelAndView criarEscola(Escola escola) {
		ModelAndView mv = new ModelAndView("criarEscola");

		return mv;
	}

	@GetMapping(value = "/mostrarEscolas")
	public ModelAndView escola(Escola escola) {
		ModelAndView mv = new ModelAndView("escola");

		mv.addObject("escola", escolaRepository.findAll( ));
		return mv;
		
	}
	
	

	@RequestMapping(value = "/adicionarEscola", method = RequestMethod.POST)
	public ModelAndView adicionarEscola(@Valid Escola escola, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return escola(escola);
		}
		escolaService.salvarEscola(escola);

		attributes.addFlashAttribute("mensagem", "Escola cadastrado com sucesso!");
		return new ModelAndView("redirect:/escola/criarEscola");
	}
	
//	@RequestMapping(value="/editarEscola", method=RequestMethod.POST)
//	public ModelAndView atualizarEscola(@Valid Escola escola, BindingResult result, RedirectAttributes attributes) {
//		if(result.hasErrors()) {
//			return escola(escola);
//		}
//		escolaService.editarEscola(escola);
//		 
//		attributes.addFlashAttribute("mensagem", "Escola editado com sucesso!");
//		return new ModelAndView("redirect:/escola/mostrarEscolas");
//	}

	@RequestMapping(value = "/excluirEscola", method = RequestMethod.POST)
	public ModelAndView excluirEscola(@Valid Escola escola, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return escola(escola);
		}
		escolaService.excluirEscola(escola);

		attributes.addFlashAttribute("mensagem", "Escola removido com sucesso!");
		return new ModelAndView("redirect:/escola/mostrarEscolas");
	}

}
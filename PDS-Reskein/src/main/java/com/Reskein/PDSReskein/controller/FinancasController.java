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

import com.Reskein.PDSReskein.model.Financas;
import com.Reskein.PDSReskein.repository.FinancasRepository;
import com.Reskein.PDSReskein.service.FinancasService;


@Controller
@RequestMapping("/financas")
public class FinancasController {
	
	@Autowired
	private FinancasRepository financasRepository;
	
	@Autowired
	private FinancasService financasService;
	
	@GetMapping(value = "/mostrarFinancass")
	public ModelAndView financas(Financas financas) {
		ModelAndView mv = new ModelAndView("financas");
		
		mv.addObject("financas", financasRepository.findAll());
		return mv;
	}
	
	@RequestMapping(value = "/excluirFinancas", method = RequestMethod.POST)
	public ModelAndView excluirFinancas(@Valid Financas financas, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return financas(financas);
		}
		financasService.excluirFinancas(financas);

		attributes.addFlashAttribute("mensagem", "Financas removidas com sucesso!");
		return new ModelAndView("redirect:/financas/mostrarFinancass");
	}

	@RequestMapping(value="/editarFinancas", method=RequestMethod.POST)
	public ModelAndView atualizarFinancas(@Valid Financas financas, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			return financas(financas);
		}
		financasService.editarFinancas(financas);
		 
		attributes.addFlashAttribute("mensagem", "Financas editadas com sucesso!");
		return new ModelAndView("redirect:/financas/mostrarFinancass");
	}
	
	@RequestMapping(value="/adicionarFinancas",method=RequestMethod.POST)
	public ModelAndView adicionarFinancas(@Valid Financas financas, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			return financas(financas);
		}
		financasService.salvarFinancas(financas);
		
		attributes.addFlashAttribute("mensagem", "Ocorrência cadastrada com sucesso!");
		return new ModelAndView("redirect:/financas/mostrarFinancass");
	}
}
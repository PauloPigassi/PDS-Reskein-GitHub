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

import com.Reskein.PDSReskein.model.GastoExtra;
import com.Reskein.PDSReskein.repository.GastoExtraRepository;
import com.Reskein.PDSReskein.service.GastoExtraService;


@Controller
@RequestMapping("/gastoExtra")
public class GastoExtraController {
	
	@Autowired
	private GastoExtraRepository gastoExtraRepository;
	
	@Autowired
	private GastoExtraService gastoExtraService;
	
	@GetMapping(value = "/mostrarGastoExtras")
	public ModelAndView gastoExtra(GastoExtra gastoExtra) {
		ModelAndView mv = new ModelAndView("gastoExtra");
		
		mv.addObject("gastoExtra", gastoExtraRepository.findAll());
		return mv;
	}
	@RequestMapping(value = "/excluirGastoExtra", method = RequestMethod.POST)
	public ModelAndView excluirGastoExtra(@Valid GastoExtra gastoExtra, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return gastoExtra(gastoExtra);
		}
		gastoExtraService.excluirGastoExtra(gastoExtra);

		attributes.addFlashAttribute("mensagem", "GastoExtra removido com sucesso!");
		return new ModelAndView("redirect:/gastoExtra/mostrarGastoExtra");
	}

//	@RequestMapping(value="/editarGastoExtra", method=RequestMethod.POST)
//	public ModelAndView atualizarGastoExtra(@Valid GastoExtra gastoExtra, BindingResult result, RedirectAttributes attributes) {
//		if(result.hasErrors()) {
//			return gastoExtra(gastoExtra);
//		}
//		gastoExtraService.editarGastoExtra(gastoExtra);
//		 
//		attributes.addFlashAttribute("mensagem", "GastoExtra editado com sucesso!");
//		return new ModelAndView("redirect:/gastoExtra/mostrarGastoExtra");
//	}
	
	@RequestMapping(value="/adicionarGastoExtra",method=RequestMethod.POST)
	public ModelAndView adicionarGastoExtra(@Valid GastoExtra gastoExtra, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			return gastoExtra(gastoExtra);
		}
		gastoExtraService.salvarGastoExtra(gastoExtra);
		
		attributes.addFlashAttribute("mensagem", "Ocorrência cadastrada com sucesso!");
		return new ModelAndView("redirect:/gastoExtra/mostrarGastoExtras");
	}
}
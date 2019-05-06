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

import com.Reskein.PDSReskein.model.Viagem;
import com.Reskein.PDSReskein.repository.ViagemRepository;
import com.Reskein.PDSReskein.service.ViagemService;

@Controller
@RequestMapping("/viagem")
public class ViagemController {

	@Autowired
	private ViagemRepository viagemRepository;

	@Autowired
	private ViagemService viagemService;
	
	@GetMapping(value = "/criarViagem")
	public ModelAndView criarViagem(Viagem viagem) {
		ModelAndView mv = new ModelAndView("criarViagem");

		return mv;
	}
	

	@GetMapping(value = "/mostrarViagems")
	public ModelAndView viagem(Viagem viagem) {
		ModelAndView mv = new ModelAndView("visualizarViagem");

		mv.addObject("viagem", viagemRepository.findAll( ));
		return mv;
		
	}
	
	

	@RequestMapping(value = "/adicionarViagem", method = RequestMethod.POST)
	public ModelAndView adicionarViagem(@Valid Viagem viagem, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return viagem(viagem);
		}
		viagemService.salvarViagem(viagem);

		attributes.addFlashAttribute("mensagem", "Viagem cadastrado com sucesso!");
		return new ModelAndView("redirect:/viagem/criarViagem");
	}
	
//	@RequestMapping(value="/editarViagem", method=RequestMethod.POST)
//	public ModelAndView atualizarViagem(@Valid Viagem viagem, BindingResult result, RedirectAttributes attributes) {
//		if(result.hasErrors()) {
//			return viagem(viagem);
//		}
//		viagemService.editarViagem(viagem);
//		 
//		attributes.addFlashAttribute("mensagem", "Viagem editado com sucesso!");
//		return new ModelAndView("redirect:/viagem/mostrarViagems");
//	}

	@RequestMapping(value = "/excluirViagem", method = RequestMethod.POST)
	public ModelAndView excluirViagem(@Valid Viagem viagem, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return viagem(viagem);
		}
		viagemService.excluirViagem(viagem);

		attributes.addFlashAttribute("mensagem", "Viagem removido com sucesso!");
		return new ModelAndView("redirect:/viagem/mostrarViagems");
	}

}
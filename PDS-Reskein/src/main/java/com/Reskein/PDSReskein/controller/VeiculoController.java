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

import com.Reskein.PDSReskein.model.Veiculo;
import com.Reskein.PDSReskein.repository.VeiculoRepository;
import com.Reskein.PDSReskein.service.VeiculoService;

@Controller
@RequestMapping("/veiculo")
public class VeiculoController {

	@Autowired
	private VeiculoRepository veiculoRepository;

	@Autowired
	private VeiculoService veiculoService;

	@GetMapping(value = "/mostrarVeiculos")
	public ModelAndView veiculo(Veiculo veiculo) {
		ModelAndView mv = new ModelAndView("veiculo");

		mv.addObject("veiculo", veiculoRepository.findAll( ));
		return mv;
	}

	@RequestMapping(value = "/adicionarVeiculo", method = RequestMethod.POST)
	public ModelAndView adicionarVeiculo(@Valid Veiculo veiculo, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return veiculo(veiculo);
		}
		veiculoService.salvarVeiculo(veiculo);

		attributes.addFlashAttribute("mensagem", "Veiculo cadastrado com sucesso!");
		return new ModelAndView("redirect:/veiculo/mostrarVeiculos");
	}
//	@RequestMapping(value="/editarVeiculo", method=RequestMethod.POST)
//	public ModelAndView atualizarVeiculo(@Valid Veiculo veiculo, BindingResult result, RedirectAttributes attributes) {
//		if(result.hasErrors()) {
//			return veiculo(veiculo);
//		}
//		veiculoService.editarVeiculo(veiculo);
//		 
//		attributes.addFlashAttribute("mensagem", "Veiculo editado com sucesso!");
//		return new ModelAndView("redirect:/veiculo/mostrarVeiculos");
//	}

	@RequestMapping(value = "/excluirVeiculo", method = RequestMethod.POST)
	public ModelAndView excluirVeiculo(@Valid Veiculo veiculo, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return veiculo(veiculo);
		}
		veiculoService.excluirVeiculo(veiculo);

		attributes.addFlashAttribute("mensagem", "Veiculo removido com sucesso!");
		return new ModelAndView("redirect:/veiculo/mostrarVeiculos");
	}

}
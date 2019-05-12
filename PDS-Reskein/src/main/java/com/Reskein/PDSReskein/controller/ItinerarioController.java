package com.Reskein.PDSReskein.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Reskein.PDSReskein.model.Aluno;
import com.Reskein.PDSReskein.model.Escola;
import com.Reskein.PDSReskein.model.Itinerario;
import com.Reskein.PDSReskein.repository.AlunoRepository;
import com.Reskein.PDSReskein.repository.EscolaRepository;
import com.Reskein.PDSReskein.repository.ItinerarioRepository;
import com.Reskein.PDSReskein.service.ItinerarioService;




@Controller
@RequestMapping("/")
public class ItinerarioController {
	
	@Autowired
	private ItinerarioRepository itinerarioRepository;
	
	@Autowired
	private EscolaRepository escolaRepository;
	
	@Autowired
	private AlunoRepository alunoRepository;
	

	

	@Autowired
	private ItinerarioService itinerarioService;
	
	@GetMapping(value = "itinerario/criarItinerario")
	public ModelAndView criarItinerario(Itinerario itinerario) {
		ModelAndView mv = new ModelAndView("criaritinerario");
		
		  List<Escola> escolaLista = escolaRepository.findAll();
		  mv.addObject("escolaLista", escolaRepository.findAll( ));
		  
		  List<Aluno> alunoLista = alunoRepository.findAll();
		  mv.addObject("alunoLista", alunoRepository.findAll());

		return mv;
	}
	
	@GetMapping(value = "itinerario/gerenciarItinerario")
	public ModelAndView gerenciarItinerario(Itinerario itinerario, Aluno aluno, Escola escola) {
		ModelAndView mv = new ModelAndView("gerenciaritinerario");
		
		
		
		List<Itinerario> itinerarioLista = itinerarioRepository.findAllById(itinerario.getIdItinerario());
		  mv.addObject("itinerarioLista", itinerarioRepository.findAllById(itinerario.getIdItinerario()));
		  
		

		return mv;
	}
	
	

	@GetMapping(value = "itinerario/mostrarItinerarios")
	public ModelAndView itinerario(Itinerario itinerario) {
		ModelAndView mv = new ModelAndView("visualizarItinerario");

		mv.addObject("itinerarioLista", itinerarioRepository.findAll( ));
		return mv;
		
	}
	
	

	@RequestMapping(value = "itinerario/adicionarItinerario", method = RequestMethod.POST)
	public ModelAndView adicionarItinerario(@Valid Itinerario itinerario, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return itinerario(itinerario);
		}
		itinerarioService.salvarItinerario(itinerario);

		attributes.addFlashAttribute("mensagem", "Itinerario cadastrado com sucesso!");
		return new ModelAndView("redirect:/itinerario/criarItinerario");
	}
	
//	@RequestMapping(value="/editarItinerario", method=RequestMethod.POST)
//	public ModelAndView atualizarItinerario(@Valid Itinerario itinerario, BindingResult result, RedirectAttributes attributes) {
//		if(result.hasErrors()) {
//			return itinerario(itinerario);
//		}
//		itinerarioService.editarItinerario(itinerario);
//		 
//		attributes.addFlashAttribute("mensagem", "Itinerario editado com sucesso!");
//		return new ModelAndView("redirect:/itinerario/mostrarItinerarios");
//	}

	@RequestMapping(value = "/excluirItinerario", method = RequestMethod.POST)
	public ModelAndView excluirItinerario(@Valid Itinerario itinerario, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return itinerario(itinerario);
		}
		itinerarioService.excluirItinerario(itinerario);

		attributes.addFlashAttribute("mensagem", "Itinerario removido com sucesso!");
		return new ModelAndView("redirect:/itinerario/mostrarItinerarios");
	}

}
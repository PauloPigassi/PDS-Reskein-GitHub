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

import com.Reskein.PDSReskein.model.Aluno;
import com.Reskein.PDSReskein.repository.AlunoRepository;
import com.Reskein.PDSReskein.service.AlunoService;


@Controller
@RequestMapping("/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoRepository alunoRepository;

	@Autowired
	private AlunoService alunoService;
	
	@GetMapping(value = "/criarAluno")
	public ModelAndView criarAluno(Aluno aluno) {
		ModelAndView mv = new ModelAndView("criarAluno");

		return mv;
	}
	

	@GetMapping(value = "/mostrarAlunos")
	public ModelAndView aluno(Aluno aluno) {
		ModelAndView mv = new ModelAndView("visualizarAluno");

		mv.addObject("aluno", alunoRepository.findAll( ));
		return mv;
		
	}
	
	

	@RequestMapping(value = "/adicionarAluno", method = RequestMethod.POST)
	public ModelAndView adicionarAluno(@Valid Aluno aluno, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return aluno(aluno);
		}
		alunoService.salvarAluno(aluno);

		attributes.addFlashAttribute("mensagem", "Aluno cadastrado com sucesso!");
		return new ModelAndView("redirect:/aluno/criarAluno");
	}
	
//	@RequestMapping(value="/editarAluno", method=RequestMethod.POST)
//	public ModelAndView atualizarAluno(@Valid Aluno aluno, BindingResult result, RedirectAttributes attributes) {
//		if(result.hasErrors()) {
//			return aluno(aluno);
//		}
//		alunoService.editarAluno(aluno);
//		 
//		attributes.addFlashAttribute("mensagem", "Aluno editado com sucesso!");
//		return new ModelAndView("redirect:/aluno/mostrarAlunos");
//	}

	@RequestMapping(value = "/excluirAluno", method = RequestMethod.POST)
	public ModelAndView excluirAluno(@Valid Aluno aluno, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return aluno(aluno);
		}
		alunoService.excluirAluno(aluno);

		attributes.addFlashAttribute("mensagem", "Aluno removido com sucesso!");
		return new ModelAndView("redirect:/aluno/mostrarAlunos");
	}

}
	
//	@RequestMapping(value="/editarAluno", method=RequestMethod.POST)
//	public ModelAndView atualizarAluno(@Valid Aluno aluno, BindingResult result, RedirectAttributes attributes) {
//		if(result.hasErrors()) {
//			return aluno(aluno);
//		}
//		alunoService.editarAluno(aluno);
//		 
//		attributes.addFlashAttribute("mensagem", "Aluno editado com sucesso!");
//		return new ModelAndView("redirect:/aluno/mostrarAlunos");
//	}
}
	
	
	
//	@GetMapping ("/addAluno")
//	public @ResponseBody String addAluno (@RequestParam String endereco
//			, @RequestParam String contato) {
//		// @ResponseBody means the returned String is the response, not a view name
//		// @RequestParam means it is a parameter from the GET or POST request
//
//		Aluno n = new Aluno();
//		n.setContato(contato);
//		n.setEndereco(endereco);
//		alunoRepository.save(n);
//				
//		return "Saved";
//	}
//	@GetMapping(path="/mostrarAlunos")
//	public @ResponseBody Iterable<Aluno> mostrarTodosAlunos() {
//		// This returns a JSON or XML with the users
//		return alunoRepository.findAll();
//	}



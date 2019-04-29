package com.Reskein.PDSReskein.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Reskein.PDSReskein.model.Perueiro;
import com.Reskein.PDSReskein.model.Viagem;


@Controller
@RequestMapping("/")
public class PostController {
	
//	@Autowired
//	private PerueiroRepository perueiroRepository;
//	
//	@Autowired
//	private PerueiroService perueiroService;
	
	@GetMapping(value = "/login")
	public ModelAndView login(Perueiro perueiro) {
		ModelAndView mv = new ModelAndView("login");

		return mv;
	}
	
	@GetMapping(value = "/dashboard")
	public ModelAndView dashboard(Perueiro perueiro) {
		ModelAndView mv = new ModelAndView("dashboard");

		return mv;
	}
	
	
//	@GetMapping(value = "/criarviagem")
//	public ModelAndView dashboard(Viagem viagem) {
//		ModelAndView mv = new ModelAndView("criarviagem");
//
//		return mv;
//	}
	
	}
	
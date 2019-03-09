package com.Reskein.PDSReskein.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PostController {
	public String home() {
		return "home";
	}
}

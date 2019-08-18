package com.bolsadeideas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.di.app.models.services.MiServicio;

@Controller
public class IndexController {
	/*
	 * Con la anotación @Autowired no hace falta instanciar un objeto, el framework lo hace
	 * */
	@Autowired
	private MiServicio miServicio;
	
	@GetMapping({"/","","/index"})
	public String index(Model model) {
		model.addAttribute("objeto", miServicio.operacion());
		
		
		return "index";
	}

}

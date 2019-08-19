package com.bolsadeideas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.di.app.models.services.IServicio;

@Controller
public class IndexController {
	/*
	 * Con la anotación @Autowired no hace falta instanciar un objeto, el framework lo hace
	 * */
	@Autowired
	@Qualifier("miServicioSimple")
	private IServicio miServicio;
	

	@GetMapping({"/","","/index"})
	public String index(Model model) {
		model.addAttribute("objeto", miServicio.operacion());
		
		
		return "index";
	}

	
	

}

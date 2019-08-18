package com.bolsadeideas.springboot.di.app.models.services;

import org.springframework.stereotype.Service;

@Service
public class MiServicio {

	
	public String operacion() {
		
		return "Ejecutando algún proceso importante";
	}
}

package com.bolsadeideas.springboot.di.app.models.services;

import org.springframework.stereotype.Component;

@Component("miServicioSimple")
public class MiServicio implements IServicio{

	
	public String operacion() {
		return "Ejecutando algún proceso importante";
	}
}

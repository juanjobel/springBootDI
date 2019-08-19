package com.bolsadeideas.springboot.di.app.models.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("miServicioComplejo")
public class MiServicioComplejo implements IServicio {

	@Override
	public String operacion() {
		
		return "Ejecutando un servicio algo más complejo";
	}

}

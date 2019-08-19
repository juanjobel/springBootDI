package com.bolsadeideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.di.app.models.domain.ItemFactura;
import com.bolsadeideas.springboot.di.app.models.domain.Producto;
import com.bolsadeideas.springboot.di.app.models.services.IServicio;
import com.bolsadeideas.springboot.di.app.models.services.MiServicio;
import com.bolsadeideas.springboot.di.app.models.services.MiServicioComplejo;

@Configuration
public class AppConfig {
	
	@Bean("miServicioSimple")
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}
	
	@Bean("miServicioComplejo")
	@Primary
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto1 = new Producto("Cuaderno a4", 3.96);
		Producto producto2 = new Producto("Folios paquete 500", 2.50);
		
		ItemFactura item1 = new ItemFactura(producto1, 3);
		ItemFactura item2 = new ItemFactura(producto2, 5);
		
		return Arrays.asList(item1, item2);
	}

	@Bean("itemsFacturaAlmacen")
	public List<ItemFactura> registrarItemsAlmacen(){
		Producto producto1 = new Producto("Carretilla", 203.96);
		Producto producto2 = new Producto("Embaladora", 102.50);
		Producto producto3 = new Producto("Impresora", 43.96);
		Producto producto4 = new Producto("Monitor", 132.50);
		
		ItemFactura item1 = new ItemFactura(producto1, 3);
		ItemFactura item2 = new ItemFactura(producto2, 5);
		ItemFactura item3 = new ItemFactura(producto3, 23);
		ItemFactura item4 = new ItemFactura(producto4, 15);
		
		return Arrays.asList(item1, item2, item3, item4);
	}
}

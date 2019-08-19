package com.bolsadeideas.springboot.di.app.models.domain;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class Factura {

	@Value("${factura.descripcion}")
	private String descripcion;
	
	@Autowired
	private Cliente cliente;
	
	@Autowired
	@Qualifier("itemsFacturaAlmacen")
	private List<ItemFactura> itemsFacturas;
	
	@PostConstruct
	public void inicializar() {
		System.out.println("Después de crear el bean");
		cliente.setNombre("Daniel");
		descripcion = descripcion.concat("Linea");
	}
	
	@PreDestroy
	public void destruir() {
		System.out.println("Antes de destruir el bean");
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemFactura> getItemsFacturas() {
		return itemsFacturas;
	}

	public void setItemsFacturas(List<ItemFactura> itemsFacturas) {
		this.itemsFacturas = itemsFacturas;
	}

	
}

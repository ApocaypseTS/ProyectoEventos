package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Servicio;
import pe.edu.upc.service.IServicioService;

@Named
@RequestScoped

public class ServicioController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IServicioService mService;
	private Servicio servicio;
	List<Servicio> listaServicios;
	
	@PostConstruct
	public void init() {
		this.listaServicios = new ArrayList<Servicio>();
		this.servicio = new Servicio();
		this.listar();
	}
	
	public String nuevoServicio() {
		this.setServicio(new Servicio());
		return "servicio.xhtml";
	}
	
	public void insertar() {
		mService.insertar(servicio);
		limpiarServicio();
	}
	
	public void listar() {
		listaServicios = mService.listar();
	}

	public void limpiarServicio() {
		this.init();
	}
	
	public void eliminar(Servicio servicio) {
		mService.eliminar(servicio.getId());
		this.listar();
	}
	
	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public List<Servicio> getListaServicios() {
		return listaServicios;
	}

	public void setListaServicios(List<Servicio> listaServicios) {
		this.listaServicios = listaServicios;
	}
	

}

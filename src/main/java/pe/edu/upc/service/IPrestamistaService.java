package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Prestamista;

public interface IPrestamistaService {
	public void insertar(Prestamista prestamista);
	public List<Prestamista> listar();
	public void eliminar(int idPrestamista);	
}

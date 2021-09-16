package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Prestamista;

public interface IPrestamistaDao {
	public void insertar(Prestamista prestamista);
	public List<Prestamista> listar();
	public void eliminar(int idPrestamista);		
}

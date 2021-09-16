package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Rol;

public interface IRolService {
	public void insertar(Rol rol);
	public List<Rol> listar();
	public void eliminar(int idRol);	
}

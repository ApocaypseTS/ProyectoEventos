package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPrestamistaDao;
import pe.edu.upc.entity.Prestamista;
import pe.edu.upc.service.IPrestamistaService;

@Named
@RequestScoped
public class PrestamistaServiceImpl implements IPrestamistaService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IPrestamistaDao mD;

	@Override
	public void insertar(Prestamista prestamista) {
		mD.insertar(prestamista);		
	}

	@Override
	public List<Prestamista> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idPrestamista) {
		mD.eliminar(idPrestamista);		
	}
	

}

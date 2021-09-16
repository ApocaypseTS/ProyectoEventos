package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPrestamistaDao;
import pe.edu.upc.entity.Prestamista;

public class PrestamistaDaoImpl implements IPrestamistaDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Prestamista prestamista) {
		em.persist(prestamista);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Prestamista> listar() {
		List<Prestamista> lista = new ArrayList<Prestamista>();
		Query q = em.createQuery("select p from Prestamista p");
		lista = (List<Prestamista>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override	
	public void eliminar(int idPrestamista) {
		Prestamista prestamista = new Prestamista();
		prestamista = em.getReference(Prestamista.class, idPrestamista);
		em.remove(prestamista);
	}
	
}

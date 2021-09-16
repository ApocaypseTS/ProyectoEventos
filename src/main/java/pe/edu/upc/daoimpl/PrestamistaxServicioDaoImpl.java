package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPrestamistaxServicioDao;
import pe.edu.upc.entity.PrestamistaxServicio;

public class PrestamistaxServicioDaoImpl implements IPrestamistaxServicioDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(PrestamistaxServicio prestamistaxServicio) {
		em.persist(prestamistaxServicio);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PrestamistaxServicio> listar() {
		List<PrestamistaxServicio> lista = new ArrayList<PrestamistaxServicio>();
		Query q = em.createQuery("select p from PrestamistaxServicio p");
		lista = (List<PrestamistaxServicio>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override	
	public void eliminar(int idPrestamistaxServicio) {
		PrestamistaxServicio prestamistaxServicio = new PrestamistaxServicio();
		prestamistaxServicio = em.getReference(PrestamistaxServicio.class, idPrestamistaxServicio);
		em.remove(prestamistaxServicio);		
	}
	
}

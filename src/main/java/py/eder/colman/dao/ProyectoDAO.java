package py.eder.colman.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.eder.colman.entidad.Proyecto;



@Repository
public class ProyectoDAO extends DAOGenerico<Proyecto> {

	public ProyectoDAO() {
		
		super(Proyecto.class);
	}
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	protected EntityManager getEntityManager() {
		
		return em;
	}
}

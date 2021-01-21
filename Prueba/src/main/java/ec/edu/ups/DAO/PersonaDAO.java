package ec.edu.ups.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.modelo.Persona;
@Stateless
public class PersonaDAO {
	@Inject
	private Connection con;
	@Inject
	private EntityManager em;
	public boolean insertJPA(Persona entity) throws SQLException {
		em.persist(entity);
		return true;
	}
	public List<Persona> buscarPersona(String cedula) {
		String jpql= "Select c from Persona c where c.cedula =?1";
		Query q = em.createQuery(jpql, Persona.class);
		q.setParameter(1, cedula);
		return (List<Persona>) q.getResultList();
	}
	 public Persona read(String cedula) throws Exception {
	        try {
	            return em.find(Persona.class, cedula);
	        } catch (Exception e) {
	            throw new Exception("Erro leer Cliente " +e.getMessage());
	        }
	    }
}

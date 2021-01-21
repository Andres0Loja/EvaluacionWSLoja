package ec.edu.ups.DAO;

import java.sql.Connection;
import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.modelo.Persona;
import ec.edu.ups.modelo.Titulo;

@Stateless
public class TituloDAO {
	@Inject
	private Connection con;
	@Inject
	private EntityManager em;
	public Titulo read(int id) throws Exception {
        try {
            return em.find(Titulo.class, id);
        } catch (Exception e) {
            throw new Exception("Erro leer Cliente " +e.getMessage());
        }
    }
	public boolean insertJPA(Titulo entity) throws SQLException {
		em.persist(entity);
		return true;
	}
	public Titulo read2(int id) throws Exception {
        try {
            return em.find(Titulo.class, id);
        } catch (Exception e) {
            throw new Exception("Erro leer Cliente " +e.getMessage());
        }
    }
}

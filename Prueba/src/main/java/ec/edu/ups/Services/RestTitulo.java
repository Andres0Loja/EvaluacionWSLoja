package ec.edu.ups.Services;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import ec.edu.ups.DAO.PersonaDAO;
import ec.edu.ups.DAO.TituloDAO;
import ec.edu.ups.ON.TituloON;
import ec.edu.ups.modelo.Persona;
import ec.edu.ups.modelo.Titulo;

@Path("titulos")
public class RestTitulo {
	
	@Inject
	private TituloON co;
	@Inject
	private PersonaDAO p;
	@Inject
	private TituloDAO tdao;
	//Este sirve Guarda el titulo
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	@Path("prueba")
	 public String retitulo(Titulo titulo) {
		try {
			co.registrarTitulo(titulo);
			return "sa";
		} catch (Exception e) {
			e.printStackTrace();
			return "Hola";
		}
	}
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	@Path("lista")
	 public List<Persona> buscar(String cedula) {
		try {
			
			return co.buscarTitulo(cedula);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@GET
	@Produces("application/json")
	@Consumes("application/json")
	@Path("lista2")
	 public List<Persona> buscar2(@QueryParam("cedula") String cedula) {
		try {
			
			return co.buscarTitulo(cedula);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@GET
	@Path("lista3")
	@Produces("application/json")
	 public Titulo buscar3(@QueryParam("t") int t) {
		try {
			
			return tdao.read2(t);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

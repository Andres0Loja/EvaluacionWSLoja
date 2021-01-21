package ec.edu.ups.ON;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import ec.edu.ups.DAO.PersonaDAO;
import ec.edu.ups.DAO.TituloDAO;
import ec.edu.ups.modelo.Persona;
import ec.edu.ups.modelo.Titulo;

public class TituloON {
	@Inject
	private PersonaDAO daoPersona;
	@Inject
	private TituloDAO daoTitulo;
	Date date = new Date();
	public String registrarTitulo(Titulo titulo) throws Exception {
		if (titulo.getPersona().getCedula().length() != 10) {
			return "Cedula Incorrecta";
		}else {
			titulo.setFecha(date);
			daoTitulo.insertJPA(titulo);
			return "ä";
		}		
	}
	public List<Persona> buscarTitulo(String cedula){
		return daoPersona.buscarPersona(cedula);
	}
}

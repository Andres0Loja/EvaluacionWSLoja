package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;




public class Persona{
	private static final long serialVersionUID=1L;
	private String cedula;
	private String nombre;
	private String telefono;
	private List<Titulo> titulo=new ArrayList<Titulo>();
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public List<Titulo> getTitulo() {
		return titulo;
	}
	public void setTitulo(List<Titulo> titulo) {
		this.titulo = titulo;
	}
	
}

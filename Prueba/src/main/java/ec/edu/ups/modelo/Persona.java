package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Persona implements Serializable{
	private static final long serialVersionUID=1L;
	@Id
	private String cedula;
	private String nombre;
	private String telefono;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
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

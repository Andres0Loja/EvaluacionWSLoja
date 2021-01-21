package ec.edu.ups.rest;

import ec.edu.ups.modelo.Persona;
import ec.edu.ups.modelo.Titulo;
import java.util.List;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
public class cliente {
	private final String WS_SAVE_CATEGORIA = "http://localhost:8080/Prueba/ws/titulos/prueba";
        private final String WS_SAVE_CATEGORIA2 = "http://localhost:8080/Prueba/ws/titulos/lista";
        private final String WS_SAVE_CATEGORIA3 = "http://localhost:8080/Prueba/ws/titulos/lista3";
        
	public void saveCategogira(Titulo titulo) {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(WS_SAVE_CATEGORIA);
        Response mensaje=target.request().post(Entity.json(titulo));
            System.out.println(mensaje);
    }
        public List<Persona> getCategorias() {
		Client client = ClientBuilder.newClient();		
		WebTarget target = client.target(WS_SAVE_CATEGORIA2);

		List<Persona> categorias = target.request().get(new GenericType<List<Persona>>() {});
		
		client.close();
		
		return categorias;		
	}
        
        public Titulo getCategoria(int t) {
		Client client = ClientBuilder.newClient();
		
		
		WebTarget target = client.target(
				WS_SAVE_CATEGORIA3).queryParam("t", t);

		Titulo categoria = target.request().get(Titulo.class);
		
		client.close();
		
		return categoria;		
	}
        
        public List<Persona> bus(String cedula) {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(WS_SAVE_CATEGORIA2);
        List<Persona> mensaje=(List<Persona>) target.request().post(Entity.json(cedula));
            System.out.println(mensaje);
            return mensaje;
    }

}

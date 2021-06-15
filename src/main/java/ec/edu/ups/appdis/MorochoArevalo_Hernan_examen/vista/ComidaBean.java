package ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.vista;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.annotation.FacesConfig;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.clases.Comida;
import ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.ejb.ComidaFacade;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@ManagedBean
@ViewScoped
public class ComidaBean implements Serializable {
	
	@EJB
	private ComidaFacade comidaFacade;

	private String nombre;
	private double precio;
	private List<Comida> listacomidas ;
	
	public ComidaBean() {
		listacomidas = new ArrayList<Comida>();

	}

	@PostConstruct
	public void init() {
		listacomidas = comidaFacade.findAll();

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	public List<Comida> getListacomidas() {
		return listacomidas;
	}

	public void setListacomidas(List<Comida> listacomidas) {
		this.listacomidas = listacomidas;
	}

	public void agregar() {
		Comida com = new Comida();
		com.setNombre(this.nombre);
		com.setPrecioUnitario(this.precio);
		comidaFacade.create(com);
	}
	

}

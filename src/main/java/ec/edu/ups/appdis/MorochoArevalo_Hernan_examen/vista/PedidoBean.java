package ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.vista;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.clases.Comida;

import javax.enterprise.context.Dependent;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@Dependent
public class PedidoBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	private PedidoFacade pedidoFacade;
	@EJB
	private ComidaFacade comidaFacade;
	
	
	public PedidoBean() {
		
	}
	
	Date fec = new Date();
	
	public String detalle = "";
	
	public String fecha = fec.getDate()+"/"+fec.getMonth()+"/"+fec.getYear();
	public List<Comida> listaComidas = comidaFacade.findAll();
			
	
	public List<Comida> getListaComidas() {
		return listaComidas;
	}



	public void setListaComidas(List<Comida> listaComidas) {
		this.listaComidas = listaComidas;
	}



	@PostConstruct
	public void init() {
		
	    }



	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	


}

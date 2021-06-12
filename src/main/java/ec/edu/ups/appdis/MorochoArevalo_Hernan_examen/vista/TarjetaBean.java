package ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.vista;

import java.util.ArrayList;
import java.util.List;

import javax.faces.annotation.FacesConfig;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.clases.Tarjeta;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@ManagedBean
@ViewScoped
public class TarjetaBean {
	
	private List<Tarjeta> listaTarjetas = new ArrayList<Tarjeta>();
}

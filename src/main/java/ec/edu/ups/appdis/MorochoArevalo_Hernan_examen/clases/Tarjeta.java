package ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.clases;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tarjeta implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String numeroTarjeta;
	private String nombreTitular;
	private String fechaCaducidad;
	private String codigoVerificacion;
	
	
	public Tarjeta() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getCodigoVerificacion() {
		return codigoVerificacion;
	}

	public void setCodigoVerificacion(String codigoVerificacion) {
		this.codigoVerificacion = codigoVerificacion;
	}

}

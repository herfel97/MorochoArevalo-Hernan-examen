package ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.clases;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comida {
	@Id	
	private int id;
	private String nombre;
	private double precioUnitario;
	
	public Comida() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
}

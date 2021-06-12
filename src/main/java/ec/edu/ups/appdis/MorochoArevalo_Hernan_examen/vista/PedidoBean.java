package ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.vista;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.annotation.FacesConfig;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.clases.Comida;
import ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.clases.DetallePedido;
import ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.clases.Tarjeta;
import ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.ejb.ComidaFacade;
import ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.ejb.PedidoFacade;
import ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.ejb.TarjetaFacade;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@ManagedBean
@ViewScoped
public class PedidoBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	private PedidoFacade pedidoFacade;
	@EJB
	private ComidaFacade comidaFacade;
	@EJB
	private TarjetaFacade tarjetaFacade;
	
	String fecha;

	String detalle = "";

	List<Comida> listaComidas;
	List<Tarjeta> listaTarjetas;
	Date fec = new Date();
	private Comida comida = new Comida();
	int cantidad;
	List<DetallePedido> listaDetalles = new ArrayList<DetallePedido>();
	private double total = 0;
	private double subtotal = 0;
	private double IVA= 0;

	public PedidoBean() {

	}

	@PostConstruct
	public void init() {
		this.fecha = fec.getDate() + "/" + fec.getMonth() + "/" + fec.getYear();
		this.listaComidas = comidaFacade.findAll();
		this.listaTarjetas = tarjetaFacade.findAll();
		
	}

	public List<Comida> getListaComidas() {
		return listaComidas;
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

	public Comida getComida() {
		return comida;
	}

	public void setComida(Comida comida) {
		this.comida = comida;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public List<DetallePedido> getListaDetalles() {
		return listaDetalles;
	}

	public void setListaDetalles(List<DetallePedido> listaDetalles) {
		this.listaDetalles = listaDetalles;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getIVA() {
		System.out.println("IVA" + subtotal*0.12);
		return subtotal*0.12;
	}
	
	public List<Tarjeta> getListaTarjetas() {
		return listaTarjetas;
	}

	public void setListaTarjetas(List<Tarjeta> listaTarjetas) {
		this.listaTarjetas = listaTarjetas;
	}

	public void agregar() {
		DetallePedido deta = new DetallePedido();
		deta.setCantidad(this.cantidad);
		deta.setComida(this.comida);
		deta.setSubtotal(this.comida.getPrecioUnitario() * this.cantidad);
		this.listaDetalles.add(deta);
		subtotal = subtotal + deta.getSubtotal();
		total = total +subtotal;
	}
	
	public void remover(int index) {
		this.listaDetalles.remove(index);
	}

}

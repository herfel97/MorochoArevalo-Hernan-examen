package ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.daos;

import java.util.List;

import ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.clases.Pedido;

public interface PedidosDAO extends GenericDAO<Pedido, Integer>{
	
	public List<Pedido> getLista(); 

}

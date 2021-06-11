package ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.daos;

import java.util.List;

import ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.clases.Pedido;

public class JPAPedidosDAO extends JPAGenericDAO<Pedido, Integer> implements PedidosDAO{
	
	public JPAPedidosDAO() {
		super(Pedido.class);
	}

	@Override
	public List<Pedido> getLista() {
		// TODO Auto-generated method stub
		return null;
	}

}

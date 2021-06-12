package ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.clases.Pedido;

@Stateless
public class PedidoFacade extends AbstractFacade<Pedido>{
	
	@PersistenceContext(unitName = "MorochoArevalo-Hernan-examenPersistenceUnit")
	private EntityManager em;
	
	public PedidoFacade() {
		super(Pedido.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

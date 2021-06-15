package ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.ejb;

import java.util.List;

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

	public List<Pedido> listarPorTarjeta(String numTarjeta){
		
		String jpql = "SELECT p FROM Pedido p WHERE p.tarjeta.numeroTarjeta='"+numTarjeta+"'";
		System.out.println(jpql);
		return em.createQuery(jpql).getResultList();
	}
	
}

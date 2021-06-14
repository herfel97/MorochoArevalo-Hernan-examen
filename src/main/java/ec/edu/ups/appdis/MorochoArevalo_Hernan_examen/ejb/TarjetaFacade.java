package ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.clases.Tarjeta;

@Stateless
public class TarjetaFacade extends AbstractFacade<Tarjeta>{

	@PersistenceContext(unitName = "MorochoArevalo-Hernan-examenPersistenceUnit")
	private EntityManager em;
	
	public TarjetaFacade() {
		super(Tarjeta.class);
	}
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
	public List<Tarjeta> listarTarjetas(){
		String jpql = "SELECT t FROM Tarjeta t";
		return em.createQuery(jpql).getResultList();
	}

}

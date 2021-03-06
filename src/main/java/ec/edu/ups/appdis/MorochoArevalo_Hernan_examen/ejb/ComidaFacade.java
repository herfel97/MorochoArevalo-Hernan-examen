package ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.clases.Comida;

@Stateless
public class ComidaFacade extends AbstractFacade<Comida>{

	@PersistenceContext(unitName = "MorochoArevalo-Hernan-examenPersistenceUnit")
	private EntityManager em;
	
	public ComidaFacade() {
		super(Comida.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
}

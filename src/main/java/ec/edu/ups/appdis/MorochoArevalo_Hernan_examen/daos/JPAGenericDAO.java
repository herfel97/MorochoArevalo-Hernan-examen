package ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.daos;

import java.util.List;

import javax.persistence.EntityManager;

public class JPAGenericDAO<T,ID> implements GenericDAO<T, ID> {

	private Class<T> persistentClass;
	protected EntityManager em;
	
	
	@Override
	public void create(T entity) {
		em.getTransaction().begin();
		try {
			em.persist(entity);
			em.getTransaction().commit();
		}catch (Exception e) {
			System.out.println(">>ERROR:JPA-GENERICDA0: CREATE"+ e);
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}
	}

	@Override
	public T read(ID id) {
		return em.find(persistentClass, id);
	}

	@Override
	public void update(T entity) {
		em.getTransaction().begin();
		try {
			em.merge(entity);
			em.getTransaction().commit();
		}catch (Exception e) {
			System.out.println(">>ERROR:JPA-GENERICDA0: update"+ e);
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}		
	}

	@Override
	public void delete(T entity) {
		em.getTransaction().begin();
		try {
			em.remove(entity);
			em.getTransaction().commit();
		}catch (Exception e) {
			System.out.println(">>ERROR:JPA-GENERICDA0: REMOVE"+ e);
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}
	}

	@Override
	public void deleteById(ID id) {
		T entity = this.read(id);
		if(entity != null) {
			this.delete(entity);
		}
	}

	@Override
	public List<T> find() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> find(String attributtes, String[] values) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> find(String attributtes, String[] values, String order, int index, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}

package ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.daos;

import java.util.List;

public interface GenericDAO<T, ID>{

	public void create(T entity);
	public T read (ID id);
	public void update (T entity);
	public void delete (T entity);
	public void deleteById (ID id);
	public List<T> find();
	public List<T> find(String attributtes, String[] values);
	public List<T> find(String attributtes, String[] values, String order, int index, int size);
	
}

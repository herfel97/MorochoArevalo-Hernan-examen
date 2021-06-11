package ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.daos;

public abstract class DAOFactory {
	protected static DAOFactory factory = new JPADAOFactory();
	
	public static DAOFactory getFactory() {
		return factory;
	}
	
	public abstract PedidosDAO getPedidosDAO();
	
}

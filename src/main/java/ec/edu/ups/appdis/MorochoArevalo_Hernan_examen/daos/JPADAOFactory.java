package ec.edu.ups.appdis.MorochoArevalo_Hernan_examen.daos;

public class JPADAOFactory extends DAOFactory {

	@Override
	public PedidosDAO getPedidosDAO() {
		return new JPAPedidosDAO();
	}
	

}

package ec.edu.ups.dao;

import ec.edu.ups.jpa.JPADAOFactory;

public abstract class DAOFactory {
	
	protected static DAOFactory factory = new JPADAOFactory();
	
	public static DAOFactory getFactory(){
		return factory;
	}
	
	public abstract ComidaDAO getComidaDAO();
    public abstract PedidoDAO getPedidoDAO();
    public abstract TarjetaDAO getTarjetaDao();

}

package ec.edu.ups.jpa;

import java.util.List;

import ec.edu.ups.dao.TarjetaDAO;
import ec.edu.ups.modelo.Comida;
import ec.edu.ups.modelo.Tarjeta;

public class JPATarjetaDAO extends JPAGenericDAO<Tarjeta, Integer> implements TarjetaDAO{

	public JPATarjetaDAO() {
		super(Tarjeta.class);
	}

}

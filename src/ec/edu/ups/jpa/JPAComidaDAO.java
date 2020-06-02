package ec.edu.ups.jpa;

import java.util.List;

import ec.edu.ups.dao.ComidaDAO;
import ec.edu.ups.modelo.*;

public class JPAComidaDAO extends JPAGenericDAO<Comida, String> implements ComidaDAO {

	public JPAComidaDAO() {
		super(Comida.class);
	}

}
	



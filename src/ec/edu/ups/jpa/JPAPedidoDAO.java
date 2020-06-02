package ec.edu.ups.jpa;

import javax.persistence.Persistence;
import ec.edu.ups.dao.*;
import ec.edu.ups.modelo.Comida;
import ec.edu.ups.modelo.Pedido;
import ec.edu.ups.dao.*;
import java.util.List;
import ec.edu.ups.dao.PedidoDAO;
import ec.edu.ups.modelo.*;

public class JPAPedidoDAO extends JPAGenericDAO<Pedido, String> implements PedidoDAO {

	public JPAPedidoDAO() {
		super(Pedido.class);
	}


}

package ec.edu.ups.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ec.edu.ups.dao.ComidaDAO;
import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.PedidoDAO;
import ec.edu.ups.modelo.Comida;
import ec.edu.ups.modelo.Pedido;

@WebServlet("/RegistarPedido")
public class Servlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public Servlet() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			response.getWriter().append("Served at: ").append(request.getContextPath());
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			
			int numero;
			String fecha;
			String cliente;
			double total;
			String observaciones;
			
			Pedido pedido = new Pedido();
			PedidoDAO pedidoDao = DAOFactory.getFactory().getPedidoDAO();
				
			
			int codigo;
			String nombre;
			String precio_unitario;
			
			Comida comida = new Comida();
			ComidaDAO comidaDao = DAOFactory.getFactory().getComidaDAO();
			
			String accion = request.getParameter("RegistarPedido");
		}
		
		protected void doPost2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			
		}
		
}

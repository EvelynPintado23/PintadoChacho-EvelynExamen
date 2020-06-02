package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Pedido
 *
 */
@Entity
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int numero;
	private String fecha;
	private String cliente;
	private double total;
	private String observaciones;	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido")
	private List<Comida> comida = new ArrayList<Comida>();
	
	public Pedido() {
		
	}
	
	public Pedido(int numero, String fecha, String cliente, double total, String observaciones) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.cliente = cliente;
		this.total = total;
		this.observaciones = observaciones;
	}

	public Pedido(int numero, String fecha, String cliente, double total, String observaciones, List<Comida> comida) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.cliente = cliente;
		this.total = total;
		this.observaciones = observaciones;
		this.comida = comida;
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public List<Comida> getComida() {
		return comida;
	}

	public void setComida(List<Comida> comida) {
		this.comida = comida;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Pedido [numero=" + numero + ", fecha=" + fecha + ", cliente=" + cliente + ", total=" + total
				+ ", observaciones=" + observaciones + ", comida=" + comida + "]";
	}
	
   
}

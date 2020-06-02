package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Comida
 *
 */
@Entity

public class Comida implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private int codigo;
	private String nombre;
	private String precio_unitario;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "comida")
	private List<Pedido> pedido = new ArrayList<Pedido>();
	
	public Comida() {
		
	}

	public Comida(int codigo, String nombre, String precio_unitario) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio_unitario = precio_unitario;
	}

	public Comida(int codigo, String nombre, String precio_unitario, List<Pedido> pedido) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio_unitario = precio_unitario;
		this.pedido = pedido;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrecio_unitario() {
		return precio_unitario;
	}

	public void setPrecio_unitario(String precio_unitario) {
		this.precio_unitario = precio_unitario;
	}

	public List<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Comida [codigo=" + codigo + ", nombre=" + nombre + ", precio_unitario=" + precio_unitario + ", pedido="
				+ pedido + "]";
	}
   
}

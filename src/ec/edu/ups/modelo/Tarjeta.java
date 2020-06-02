package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Tarjeta
 *
 */
@Entity

public class Tarjeta implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int numero_tarjeta;
	private String nombre;
	private String fecha_caducidad;
	private int ccv;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tarjeta")
	private List<Pedido> pedido = new ArrayList<Pedido>();
	
	public Tarjeta() {
		
	}	

	public Tarjeta(int numero_tarjeta, String nombre, String fecha_caducidad, int ccv) {
		super();
		this.numero_tarjeta = numero_tarjeta;
		this.nombre = nombre;
		this.fecha_caducidad = fecha_caducidad;
		this.ccv = ccv;
	}

	public Tarjeta(int numero_tarjeta, String nombre, String fecha_caducidad, int ccv, List<Pedido> pedido) {
		super();
		this.numero_tarjeta = numero_tarjeta;
		this.nombre = nombre;
		this.fecha_caducidad = fecha_caducidad;
		this.ccv = ccv;
		this.pedido = pedido;
	}

	public int getNumero_tarjeta() {
		return numero_tarjeta;
	}

	public void setNumero_tarjeta(int numero_tarjeta) {
		this.numero_tarjeta = numero_tarjeta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha_caducidad() {
		return fecha_caducidad;
	}

	public void setFecha_caducidad(String fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}

	public int getCcv() {
		return ccv;
	}

	public void setCcv(int ccv) {
		this.ccv = ccv;
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
		return "Tarjeta [numero_tarjeta=" + numero_tarjeta + ", nombre=" + nombre + ", fecha_caducidad="
				+ fecha_caducidad + ", ccv=" + ccv + ", pedido=" + pedido + "]";
	}
   
}

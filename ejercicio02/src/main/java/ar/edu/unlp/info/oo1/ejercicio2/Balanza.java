package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
		
	}
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.precioTotal+= producto.getPrecio();
		this.pesoTotal+= producto.getPeso();		
	}
	
	public Ticket emitirTicket() {
		Ticket ticket1 = new Ticket();
		ticket1.setFecha(LocalDate.now());
		ticket1.setCantidadDeProductos(this.cantidadDeProductos);
		ticket1.setPrecioTotal(this.precioTotal);
		ticket1.setPesoTotal(this.pesoTotal);

		return ticket1;
	}

	public Object getPesoTotal() {
		return pesoTotal;
	}

	public Object getPrecioTotal() {
		return precioTotal;
	}

	public Object getCantidadDeProductos() {
		return cantidadDeProductos;
	}


	
	
	
	
	
	
}

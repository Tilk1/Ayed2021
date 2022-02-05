package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Balanza {
	private ArrayList<Producto> productos = new ArrayList<Producto>();

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public void ponerEnCero() {
		productos.clear();
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);	
	}
	
	public ArrayList<Producto> getProductos() {
		return productos;
	}
	
	public Ticket emitirTicket() {
		Ticket ticket1 = new Ticket();
		ticket1.setFecha(LocalDate.now());
		ticket1.setProductos(productos);
		ticket1.setPesoTotal(getPesoTotal());
		ticket1.setPrecioTotal(getPrecioTotal());
		ticket1.setCantidadDeProductos(getCantidadDeProductos());
		return ticket1;
	}

	public Double getPesoTotal() {
		Double total = 0d;
		for (Producto producto : productos) {
			total += producto.getPeso();
		}
		return total;
	}
	
	public Double getPrecioTotal() {
		Double total = 0d;
		for (Producto producto : productos) {
			total += producto.getPrecio();
		}
		return total;
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}



	
	
	
	
	
	
}

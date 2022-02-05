package ar.edu.unlp.info.oo1.ejercicio2;

public class Ticket {
	private java.time.LocalDate fecha;

	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	
	public double getPrecioTotal() {
		return precioTotal;
	}

	public java.time.LocalDate getFecha() {
		return fecha;
	}
	
	public void setFecha(java.time.LocalDate fecha) {
		this.fecha = fecha;
	}

	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
		
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
		
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
		
	}
	
	public double impuesto(){
		return (this.precioTotal * 0.21);
	}

	public Double getPesoTotal() {
		return pesoTotal;
	}


}

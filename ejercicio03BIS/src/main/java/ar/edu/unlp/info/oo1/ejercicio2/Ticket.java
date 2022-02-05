package ar.edu.unlp.info.oo1.ejercicio2;

import java.util.ArrayList;

public class Ticket {
	private java.time.LocalDate fecha;
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	
	
	
	
	public void imprimirDetalle() {
		String string = "";
		string += "---COMPRA DIA: " + fecha + "--- \n \n"; 
		for (Producto producto : productos) {
			string += "Descripcion: "+  producto.getDescripcion() + " Peso: "
			+ producto.getPeso() + " Precio x kilo: " +
			producto.getPrecioPorKilo() + "\n";
		}
		string += "\n  Peso total: " + pesoTotal + "\n";
		string += "  Precio total: " + precioTotal;
				
		System.out.println(string);
	}
	
	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	
	
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

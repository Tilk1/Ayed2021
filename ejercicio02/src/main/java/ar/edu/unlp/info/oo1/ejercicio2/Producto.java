package ar.edu.unlp.info.oo1.ejercicio2;

public class Producto {
	private Double peso;

	private double precioPorKilo;
	private String descripcion;
	
	

	public double getPeso() {
		return this.peso;
	}

	public double getPrecio() {
		return (precioPorKilo*peso);
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setPrecioPorKilo(double i) {
		this.precioPorKilo = i;
		
	}

	public Object getPrecioPorKilo() {
		return precioPorKilo;
	}
}

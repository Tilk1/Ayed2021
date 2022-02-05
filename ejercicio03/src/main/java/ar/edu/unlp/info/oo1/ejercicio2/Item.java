package ar.edu.unlp.info.oo1.ejercicio2;


public class Item {
	private String detalle;
	private int cantidad;
	private Double costoUnitario;

	public Double costo() {
		return costoUnitario*cantidad;
	}

	public Item detalle(String detalle) {
		this.detalle = detalle;
		return this;
	}
	
	public Item costoUnitario(Double costoUnitario) {
		this.costoUnitario = costoUnitario;
		return this;
	}
	
	public Item cantidad(int cantidad) {
		this.cantidad = cantidad;
		return this;
	}

	public Double getCostoUnitario() {
		return this.costoUnitario;
	}

	public String getDetalle() {
		return this.detalle;
	}


}

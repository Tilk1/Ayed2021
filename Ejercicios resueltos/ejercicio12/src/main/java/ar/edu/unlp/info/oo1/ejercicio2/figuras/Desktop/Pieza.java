package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop;

public abstract class Pieza {

	private String material;

	protected abstract int calcularVolumen();

	public String getMaterial(){
		return material;
	}

}

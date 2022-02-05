package ar.edu.unlp.info.oo1.ejercicio2.figuras;

public class Cuadrado implements Cara{
	private double lado;

	public double getArea() {
		return Math.pow(lado, 2);
	}

	public double getPerimetro() {
		return lado * 4;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(Double lado) {
		this.lado = lado;
	}


}

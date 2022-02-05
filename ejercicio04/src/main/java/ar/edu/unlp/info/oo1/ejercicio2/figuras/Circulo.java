package ar.edu.unlp.info.oo1.ejercicio2.figuras;

public class Circulo implements Cara {
	private double radio;

	public double getPerimetro() {
		return (Math.PI) * this.getDiametro();
	}

	public double getArea() {
		return Math.PI * (Math.pow(radio, 2));
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}

	public void setDiametro(double diametro) {
		this.radio = diametro / 2;
	}

	public double getDiametro() {
		return radio * 2;
	}

}

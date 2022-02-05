package ar.edu.unlp.info.oo1.ejercicio2.figuras;

public class Cuerpo3D {

	private Cara caraBasal;

	private double altura;

	public double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public void setCaraBasal(Cara cara) {
		this.caraBasal = cara;
		
	}
	
	public double getVolumen() {
		return caraBasal.getArea() * altura;
		
	}
	
	public double getSuperficieExterior() {
		return 2 * caraBasal.getArea() +  caraBasal.getPerimetro()* this.getAltura();
		
	}
	
}
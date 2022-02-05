package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop;

public class CuentaCorriente extends Cuenta{
	private double limiteDescubierto;  //aca o en constructor?- mejor construc
	
	public CuentaCorriente() {
		this.limiteDescubierto=0;
		
	}
	
	public double getLimiteDescubierto() {
		return limiteDescubierto;
	}



	public void setLimiteDescubierto(double limiteDescubierto) {
		this.limiteDescubierto = limiteDescubierto;
	}



	public boolean puedeExtraer(double monto){
		if(limiteDescubierto >= monto)
			return true;
		return false;
	}
	
	
	
	
}

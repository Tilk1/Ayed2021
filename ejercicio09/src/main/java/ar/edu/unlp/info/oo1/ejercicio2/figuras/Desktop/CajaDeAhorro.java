package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop;

public class CajaDeAhorro extends Cuenta{
	private double saldo;
	
	
	
	public void depositar(double monto){
		super.depositar(monto - monto * 0.02);
	}
	
	public boolean extraer(double monto){
		return super.extraer(monto - monto * 0.02);
	}
	
	
	
	public boolean puedeExtraer(double monto){
		return (monto >= this.saldo); // hay q agregar el 2%
	}
	
	
	
	
}

package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop;

public class InversionEnAcciones implements Inversion {
	String nombre;
	int cantidad;
	double valorUnitario;
	
	
	
	@Override
	public double valorActual() {
		return (cantidad * valorUnitario);
	}

	
	
	
	
	
}

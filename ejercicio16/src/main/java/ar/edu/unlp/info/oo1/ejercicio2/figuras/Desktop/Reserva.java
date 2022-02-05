package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop;

public interface Reserva {

//	private DateLapse periodo;
//	private Usuario reservador;
	
	public double calcularCancelacion();
	public double calcularPrecio();
	public boolean overlaps(DateLapse otroPeriodo);
	
	
}

package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop;

import java.util.ArrayList;

public class Reserva{
	private DateLapse periodo;
	private Usuario reservador;
	//reservador no sirve para nada
	
	public boolean tieneUsuario(Usuario user) {
			if(user.equals(reservador))
				return true;
		return false;
	}
	
	
	
	public Reserva(DateLapse periodo) {
		this.periodo = periodo;
	}
	
	public DateLapse getPeriodo() {
		return periodo;
	}

	public void setPeriodo(DateLapse periodo) {
		this.periodo = periodo;
	}

	
	public boolean overlaps(DateLapse otroPeriodo){
		return this.periodo.overlaps(otroPeriodo);
	}

	public Object getReservador() {
		return reservador;
	}
	

	
	public double calcularPrecio(DateLapse periodo, double precioNoche){
		return this.periodo.diasQueOverlapea(periodo) * precioNoche;
	}
	
	
	
}

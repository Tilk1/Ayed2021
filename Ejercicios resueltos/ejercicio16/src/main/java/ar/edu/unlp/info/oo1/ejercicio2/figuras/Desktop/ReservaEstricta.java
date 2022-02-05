package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop;

import java.time.LocalDate;

public class ReservaEstricta implements Reserva{
	private DateLapse periodo;
	private Usuario reservador;
	//reservador no sirve para nada
	
	public ReservaEstricta(DateLapse periodo) {
		this.periodo = periodo;
	}
	
	public DateLapse getPeriodo() {
		return periodo;
	}

	public void setPeriodo(DateLapse periodo) {
		this.periodo = periodo;
	}


	public Object getReservador() {
		return reservador;
	}

	@Override
	public boolean overlaps(DateLapse otroPeriodo){
		return periodo.overlaps(otroPeriodo);
	}
	
	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public double calcularCancelacion() {
		if(LocalDate.now().isBefore(this.periodo.getInicio()))
			return 0;
		else
			return -1; // excepction????
	}
}

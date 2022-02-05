package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop;

import java.time.LocalDate;

public class ReservaModerada implements Reserva{
	private DateLapse periodo;
	private Usuario reservador;
	//reservador no sirve para nada
	
	public ReservaModerada(DateLapse periodo) {
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
			if(this.getPeriodo().getInicio().isAfter(LocalDate.now().plusDays(10)))
				return calcularPrecio();
			if(this.getPeriodo().getInicio().isAfter(LocalDate.now().plusDays(2)))
				return calcularPrecio()*0.5;
		else
			return -1; // excepction????
	}

}

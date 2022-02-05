package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion {
	LocalDate fechaDeConstitucion;
	double montoDepositado;
	double porcentajeDeInteresDiario;

	@Override
	public double valorActual() {
		long dif = ChronoUnit.DAYS.between(LocalDate.now(), fechaDeConstitucion);
		return montoDepositado + (montoDepositado * dif * (porcentajeDeInteresDiario / 100));
	}

}

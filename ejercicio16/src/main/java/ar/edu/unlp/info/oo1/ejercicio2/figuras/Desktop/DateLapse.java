package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	private LocalDate inicio;
	private LocalDate fin;

	public LocalDate getInicio() {
		return inicio;
	}

	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}

	public LocalDate getFin() {
		return fin;
	}

	public void setFin(LocalDate fin) {
		this.fin = fin;
	}

	public DateLapse(LocalDate ini, LocalDate fin) {
		this.from(ini, fin);
	}

	public LocalDate getFrom() {
		return inicio;
	}

	public LocalDate getTo() {
		return fin;
	}

	public void from(LocalDate aDateFrom, LocalDate aDateTo) {
		if (aDateFrom.compareTo(aDateTo) > 0) { // cheqea q fin sea desps de inicio
			this.from(aDateTo, aDateFrom); 		// en ese caso los invierte
		}
		this.inicio = aDateFrom;
		this.fin = aDateTo;
	}

	public int sizeInDays() {
		return (int) ChronoUnit.DAYS.between(inicio, fin);
	}

	public boolean includesDato(LocalDate other) { // esta entre esas fechas?
		return (other.isBefore(fin) && other.isAfter(inicio)) || other.equals(inicio) || other.equals(fin);
	}

	public boolean overlaps(DateLapse anotherDateLapse) {
	//  pregunto x si se dan casos en verde q no solapan. Negado
	//  https://i.imgur.com/oPHSN0o.png
		return !(anotherDateLapse.getInicio().isBefore(this.inicio)&& anotherDateLapse.getFin().isBefore(this.inicio) ||
				anotherDateLapse.getInicio().isAfter(this.fin) && anotherDateLapse.getFin().isAfter(this.fin));
		
		}
	

}

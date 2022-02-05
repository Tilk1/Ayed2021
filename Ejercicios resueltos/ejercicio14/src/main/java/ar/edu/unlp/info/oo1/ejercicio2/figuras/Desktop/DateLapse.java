package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import static org.junit.jupiter.api.Assertions.*;

public class DateLapse {
	private LocalDate inicio;
	private LocalDate fin;
	
	public DateLapse(LocalDate ini,LocalDate fin) {
		this.from(ini,fin);
	}
	
	public LocalDate getFrom() {
		return inicio;
	}
	
	public LocalDate getTo() {
		return fin;
	}
	
	
	public void from(LocalDate aDateFrom,LocalDate aDateTo){
		//cheqear q la inicio sea menor igual q fin > <.compareTo devuelve entero
		if(aDateFrom.compareTo(aDateTo)>0){
			this.from(aDateTo,aDateFrom);
		}
		this.inicio = aDateFrom;
		this.fin = aDateTo;
	}
	
	public int sizeInDays(){
//		Long milong = ChronoUnit.DAYS.between(inicio, fin);
//		return  milong.intValue(); //casteo
		return (int)ChronoUnit.DAYS.between(inicio, fin);
	}

	public boolean includesDato(LocalDate other) {
		return (other.isBefore(fin) && other.isAfter(inicio))
				|| other.equals(inicio) || other.equals(fin); //preguntar german
	}
	

}

package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop.farola;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop.DateLapse;

public class DateLapseTest {
	//todos los tests son desde hoy a pasado mañana
	DateLapse datelapse = new DateLapse(LocalDate.now(),LocalDate.now().plusDays(2));
	
	@Test
	public void testOverlaps(){
		int []a = {1,2,3,4,5,6};
		int i = a.length -1;
		//System.out.println(i);
		while(i>=0) {
			System.out.println(a[i]);
			i--;
		}
		
		
		//se verifican los 6 casos (4 que solapan y 2 que no)
		//  https://i.imgur.com/oPHSN0o.png

		//1
		DateLapse periodo1 = new DateLapse(LocalDate.now().minusDays(1),LocalDate.now().plusDays(1));
    	assertTrue(datelapse.overlaps(periodo1));
    	
    	//2
    	DateLapse periodo2 = new DateLapse(LocalDate.now().plusDays(2),LocalDate.now().plusDays(3));
    	assertTrue(datelapse.overlaps(periodo2));
		
    	//3
    	DateLapse periodo3 = new DateLapse(LocalDate.now().plusDays(1),LocalDate.now().plusDays(1));
    	assertTrue(datelapse.overlaps(periodo3));
		
    	//4
    	DateLapse periodo4 = new DateLapse(LocalDate.now().minusDays(6),LocalDate.now().plusDays(6));
    	assertTrue(datelapse.overlaps(periodo4));
    	
    	//5
    	DateLapse periodo5 = new DateLapse(LocalDate.now().minusDays(6),LocalDate.now().minusDays(4));
    	assertFalse(datelapse.overlaps(periodo5));
    	
    	//6
    	DateLapse periodo6 = new DateLapse(LocalDate.now().plusDays(6),LocalDate.now().plusDays(6));
    	assertFalse(datelapse.overlaps(periodo6));
	}
	
	@Test
	// cantidad de dias de hoy a pasado mañana
	public void sizeInDaysTest() {
		assertEquals(datelapse.sizeInDays(), 2);
	}
	
	@Test
	// se testean fechas incluidas (hoy),(mañana y pasado) y no incluidas(10dias)
	public void includes() {
		assertTrue(datelapse.includesDato(LocalDate.now()));
		assertTrue(datelapse.includesDato(LocalDate.now().plusDays(1)));
		assertTrue(datelapse.includesDato(LocalDate.now().plusDays(2)));
		
		assertFalse(datelapse.includesDato(LocalDate.now().plusDays(10)));
		assertFalse(datelapse.includesDato(LocalDate.now().minusDays(10)));
	}
	
}

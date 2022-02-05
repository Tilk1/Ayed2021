package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop.farola;


import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop.DateLapse;



public class DateLapseTest {
	DateLapse nuevo;
	
    @BeforeEach
    void setUp() {
    	LocalDate fecha1 = LocalDate.now();
    	LocalDate fecha2 = LocalDate.now().plusDays(10);
    	nuevo = new DateLapse(fecha1,fecha2);
    }
    
    @Test  //inicializar como
    void testDateLapse() {

    	LocalDate fecha3 = LocalDate.now().plusDays(5);
    	assertTrue(nuevo.includesDato(fecha3));
    	
    	
    	LocalDate fecha4 = LocalDate.now().plusDays(15);
    	assertFalse(nuevo.includesDato(fecha4));
    	
    	assertEquals(10, nuevo.sizeInDays());
    	
    	assertNotEquals(40, nuevo.sizeInDays());
    } 
    
    
    
    
    
}

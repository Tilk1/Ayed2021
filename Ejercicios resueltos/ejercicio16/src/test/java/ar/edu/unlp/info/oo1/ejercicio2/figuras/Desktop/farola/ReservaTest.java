package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop.farola;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop.DateLapse;
import ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop.ReservaFlexible;

public class ReservaTest {
	ReservaFlexible reserva;
	
	
    private void inicializar(){
    	LocalDate pasadoMañana  = LocalDate.now().plusDays(2);
    	DateLapse periodo = new DateLapse(LocalDate.now(),pasadoMañana);
    	reserva = new ReservaFlexible(periodo);
    }
    
	@BeforeEach
    void setUp() {
    	this.inicializar();
    } 
	
	
    @Test  //inicializar como
    void testReservaOverlap() {
    	DateLapse periodoQueSolapa = new DateLapse(LocalDate.now(),LocalDate.now().plusDays(1));
    	assertTrue(reserva.overlaps(periodoQueSolapa));

    	DateLapse periodoQueNoSolapa = new DateLapse(LocalDate.now().plusDays(5),LocalDate.now().plusDays(10));
    	assertFalse(reserva.overlaps(periodoQueNoSolapa));
    } 
	
    
    @Test 
    void testCalcularPrecio() {
    	
    	
    }
    
	
}

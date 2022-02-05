package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop;
import java.time.LocalDate;

public class Factura {
	double costoBasico = 0;
	LocalDate fecha;
	LocalDate fechaExportacion;
	
	public Factura(LocalDate fechaExportacion) {
		this.fecha = LocalDate.now();
		this.fechaExportacion = fechaExportacion;
		
	}
	
	public double getCostoBasico() {
		return this.costoBasico;
	}
	
	public double getcostoexportacion() {
		return (this.costoBasico * 0.05);
	}
	
	public double getcostofinal() {
		return (this.getcostoexportacion() + this.costoBasico);
		
	}
	
	public void setcostofinal(double costo) {
		this.costoBasico = costo;
		
	}

	public void setBasico(double d) {
		this.costoBasico = d;
		
	}
	
}

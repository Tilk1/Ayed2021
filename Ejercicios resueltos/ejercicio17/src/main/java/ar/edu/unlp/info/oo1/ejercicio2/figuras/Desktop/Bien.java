package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop;

public class Bien extends ProductoExportado{
	
	int unidades;
	double pesoxUnidad;
	double valorXU;
	
	public Bien(String descripcion,int unidades, double pesoxUnidad, double valorXU) {
		this.descripcion = descripcion;
		this.unidades = unidades;
		this.pesoxUnidad = pesoxUnidad;
		this.valorXU = valorXU;
	}
	
	public double calcularCostoBasico(){
		double total = 0;
		if ((pesoxUnidad * unidades) > 1000 )
			total=   (total + unidades*valorXU) *0.10;
			
		return total + unidades *valorXU

		
	}
	
	
	
}

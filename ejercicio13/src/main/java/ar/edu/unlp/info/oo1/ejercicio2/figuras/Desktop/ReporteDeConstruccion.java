package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop;

import java.util.ArrayList;

public class ReporteDeConstruccion {
	private ArrayList<Pieza> piezas;
	
	
	
	public ReporteDeConstruccion(ArrayList<Pieza> piezas){
		this.piezas = piezas;
	}


	public double volumenDeMaterial(String material) {
		int suma = 0;
		for (Pieza pieza : piezas) {
			if(pieza.getMaterial() == material)
				suma += pieza.calcularVolumen();
		}
		return suma;
	}
	
	
	public double superficieDeColor(String color) {
		
		
		
		
		return 0;
	}
}

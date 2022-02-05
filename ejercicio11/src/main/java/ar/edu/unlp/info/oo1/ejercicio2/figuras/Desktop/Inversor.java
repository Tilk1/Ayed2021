package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop;

import java.util.ArrayList;

public class Inversor {
	private String nombre;
	private ArrayList<Inversion> inversiones;
	
	public Inversor(String nombre, ArrayList<Inversion> inversiones) {
		this.nombre = nombre;
		this.inversiones = inversiones;
	}
	
	
	public double valorActual(){
		double sum = 0;
		for (Inversion inversion : inversiones) {
			sum += inversion.valorActual();
		}
		return sum;
	}
	
	
	
	
}

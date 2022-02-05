package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop;

import java.util.ArrayList;

public class Farola {
	private ArrayList<Farola> neighbors = new ArrayList<Farola>();
	private boolean estado;
	
	public ArrayList<Farola> getNeighbors() {
		return neighbors;
	}

	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Farola(){
		this.estado = false;
	}
	
	public void pairWithNeighbor(Farola otraFarola) {
		this.neighbors.add(otraFarola);
		otraFarola.neighbors.add(this); //reciproco
	}
	
	public void propagarOn(ArrayList<Farola> coleccionFarolas){
		for (Farola farola : coleccionFarolas) {
			farola.turnOn();
		}
	}
	
	public void propagarOff(ArrayList<Farola> coleccionFarolas){
		for (Farola farola : coleccionFarolas) {
			farola.turnOff();
		}
	}
	
	
	public void turnOn(){
		if(this.isOn() == false) {
			this.setEstado(true);
			this.propagarOn(this.neighbors);
		}
	}
	
	
	public void turnOff(){
		if(this.isOn() == true) {
			this.setEstado(false);
			this.propagarOff(this.neighbors);
		}
	}
	
	public boolean isOn() {
		return this.estado;
	}
	
	
}

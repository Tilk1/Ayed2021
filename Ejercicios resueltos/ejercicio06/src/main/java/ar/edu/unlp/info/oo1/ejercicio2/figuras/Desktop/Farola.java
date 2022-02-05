package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop;

import java.util.ArrayList;

public class Farola {
	private ArrayList<Farola> neighbors = new ArrayList<Farola>();
	private boolean estado;
	
	public ArrayList<Farola> getNeighbors() {
		return neighbors;
	}

	
	private void setEstado(boolean estado) { //tiene q ser privado
		this.estado = estado;
	}

	public Farola(){
		this.estado = false;
	}
	
	public void pairWithNeighbor(Farola otraFarola) {
		this.neighbors.add(otraFarola);
		otraFarola.neighbors.add(this); //reciproco
	}
	
	private void propagarOn(ArrayList<Farola> coleccionFarolas){ //ojo priv publico
		for (Farola farola : coleccionFarolas) {
			farola.turnOn();
		}
	}
	
	private void propagarOff(ArrayList<Farola> coleccionFarolas){
		for (Farola farola : coleccionFarolas) {
			farola.turnOff();
		}
	}
	
	
	public void turnOn(){
		if(this.isOn() == false) { //if (!this.isOn())
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

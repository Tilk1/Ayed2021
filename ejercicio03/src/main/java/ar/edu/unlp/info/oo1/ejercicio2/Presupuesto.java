package ar.edu.unlp.info.oo1.ejercicio2;
import java.util.ArrayList;

public class Presupuesto {
	private java.time.LocalDate fecha;
	private String cliente;
	private ArrayList<Item> items = new ArrayList<Item>();
	
	
public void agregarItem(Item item) {
	this.items.add(item);
	
	
}

public Double calcularTotal() {
	Double total = 0.0;
	for (Item item : items) {
		total += item.costo();
		
	}
	
	return total;

	
	
}

public Presupuesto cliente(String cliente) {
	this.cliente = cliente;
	return this;
}

	
	
	
}

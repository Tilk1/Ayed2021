package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop;

import java.time.LocalDate;
import java.util.ArrayList;

public class PropiedadEnAlquiler {
	private String nombre;
	private String descripcion;
	private double precioPorNoche;
	private String direccion;
	private Usuario propietario;
	private ArrayList<Reserva> reservas;
	
	

	public ArrayList<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(ArrayList<Reserva> reservas) {
		this.reservas = reservas;
	}

	public PropiedadEnAlquiler(String nombre, String descripcion, double precioPorNoche, String direccion, Usuario propietario) {
		this.propietario = propietario;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioPorNoche = precioPorNoche;
		this.direccion = direccion;

	}
	
	public Usuario getPropietario() {
		return propietario;
	}
	
	public boolean estasDisponible(DateLapse periodo) {
		boolean disponible = true;
		for (Reserva reserva : reservas) {
			if(reserva.overlaps(periodo)) {
				disponible = false;
				break;
			}
		}
		return disponible;
	}
	
	public void crearReserva(DateLapse periodo){
		Reserva reserva = new Reserva(periodo);
		reservas.add(reserva);
	}
	
	public void eliminarReserva(Reserva reservation){//si ya paso no se puede eliminar
		if(reservation.getPeriodo().getFin().isAfter(LocalDate.now())) 
			reservas.remove(reservation);
			
		}
		
	}

	
}

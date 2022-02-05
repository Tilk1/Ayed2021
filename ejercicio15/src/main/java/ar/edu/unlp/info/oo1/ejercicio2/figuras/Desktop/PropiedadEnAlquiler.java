package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

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
	
	public ArrayList<Reserva> obtenerReservasDeUsuario(Usuario user) {
		ArrayList<Reserva> reservasUsuario = new ArrayList<Reserva>();
		for (Reserva reserva : reservas) {
			if(reserva.tieneUsuario(user)) {
				reservasUsuario.add(reserva);
			}
		}
		return reservasUsuario;
	}
	
	public boolean estasDisponible(DateLapse periodo) {
		for (Reserva reserva : reservas) {
			if(reserva.overlaps(periodo)) {
				return false;
			}
		}
		return true;
	}
	
	public void crearReserva(DateLapse periodo){
		Reserva reserva = new Reserva(periodo);
		reservas.add(reserva);
	}
	
	public void eliminarReserva(Reserva reservation){//si ya paso no se puede eliminar
		if(LocalDate.now().isBefore(reservation.getPeriodo().getInicio()))
			reservas.remove(reservation);
			
		}
	
	public double calcularLosIngresosDeUnPropietario(Usuario propietario,DateLapse periodo) {
		double suma = 0;
		if (this.getPropietario().equals(propietario)) {
			for (Reserva reserva : reservas) {
				suma += reserva.calcularPrecio(periodo,this.precioPorNoche);
			}
			
		}
	return suma;
	}
	
	
}

	


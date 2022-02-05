package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop;

import java.time.LocalDate;
import java.util.ArrayList;

public class ServicioPropiedades {
	private ArrayList<PropiedadEnAlquiler> propiedades = new ArrayList<PropiedadEnAlquiler>();

	public PropiedadEnAlquiler registrarPropiedad(String nombre, String descripcion, double precioPorNoche,
			String direccion, Usuario propietario) {
		PropiedadEnAlquiler propiedad = new PropiedadEnAlquiler(nombre, descripcion, precioPorNoche, direccion);
		propiedad.setUsuario(propietario);
		propiedades.add(propiedad);
		return propiedad;
	}

	public ArrayList<PropiedadEnAlquiler> buscarPropiedadesDisponiblesEnUnPeriodo(LocalDate fechaInicio,
			LocalDate fechaFin) {
		DateLapse periodo = new DateLapse(fechaInicio, fechaFin);
		ArrayList<PropiedadEnAlquiler> propiedadesDisponibles = new ArrayList<PropiedadEnAlquiler>();
		for (PropiedadEnAlquiler propiedadEnAlquiler : propiedades) {
			if (propiedadEnAlquiler.estasDisponible(periodo)) {
				propiedadesDisponibles.add(propiedadEnAlquiler);
			}
		}
		return propiedadesDisponibles;
	}

	public void hacerReserva(PropiedadEnAlquiler propiedad, DateLapse periodo, Usuario usuario) {
		if (propiedad.estasDisponible(periodo)) { // voy a crear reserva desde propiedad
			propiedad.crearReserva(periodo);
		}

	}

	public ArrayList<Reserva> obtenerReservasDeUsuario(Usuario user) {// deberia delegar
		ArrayList<Reserva> reservasUsuario = new ArrayList<Reserva>();
		for (PropiedadEnAlquiler propiedadEnAlquiler : propiedades) {
			reservasUsuario.addAll(propiedadEnAlquiler.obtenerReservasDeUsuario(user));
		}
		return reservasUsuario;
	}
	
	
	
	public double calcularLosIngresosDeUnPropietario(Usuario user, LocalDate inicio, LocalDate fin) {
		DateLapse periodo = new DateLapse(inicio, fin);
		double suma = 0.0;
		for (PropiedadEnAlquiler propiedadEnAlquiler : propiedades) {
			suma += propiedadEnAlquiler.calcularLosIngresosDeUnPropietario(user,periodo);
		}
		return suma;
	}
	
	
	
	
	//MAL
	public double calcularLosIngresosDeUnPropietario2(Usuario user, LocalDate inicio, LocalDate fin) {
		DateLapse periodo = new DateLapse(inicio, fin); // delegar tambien
		double suma = 0.0;
		for (PropiedadEnAlquiler propiedadEnAlquiler : propiedades) {
			if (propiedadEnAlquiler.getPropietario().equals(user)) {
				for (Reserva reservation : propiedadEnAlquiler.getReservas()) {
					suma += reservation.calcularPrecio(); // aca calculo el precio de c/u
				}
			}
		}
		return suma;
	}

}

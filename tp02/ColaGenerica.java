package tp02;

import tp02.ListaEnlazadaGenerica;
import tp02.ListaGenerica;

public class ColaGenerica<T> {

	public ColaGenerica() {}
	
	private ListaGenerica<T> lista = new ListaEnlazadaGenerica<T>();
	
	public boolean encolar(T elem) {
		
	return lista.agregarFinal(elem);
		
	}
	
	public T desencolar() {
		T elem = lista.elemento(1);
		lista.eliminarEn(1);             
		return elem;                      
	}
	
	
	public T tope() {
		return lista.elemento(1);
	}

	public boolean esVacia() {
		return lista.esVacia();
		
	}
	
}

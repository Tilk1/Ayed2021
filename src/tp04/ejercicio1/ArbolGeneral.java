package tp04.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class ArbolGeneral<T> {

	private T dato;

	private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public void setHijos(ListaGenerica<ArbolGeneral<T>> hijos) {
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ArbolGeneral(T dato) {
		this.dato = dato;
	}

	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) {
		this(dato);
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ListaGenerica<ArbolGeneral<T>> getHijos() {
		return this.hijos;
	}

	public void agregarHijo(ArbolGeneral<T> unHijo) {

		this.getHijos().agregarFinal(unHijo);
	}

	public boolean esHoja() {

		return !this.tieneHijos();
	}
	
	public boolean tieneHijos() {
		return !this.hijos.esVacia();
	}
	
	public boolean esVacio() {

		return this.dato == null && !this.tieneHijos();
	}

	

	public void eliminarHijo(ArbolGeneral<T> hijo) {
		if (this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			if (hijos.incluye(hijo)) 
				hijos.eliminar(hijo);
		}
	}
	
	public Integer altura() {
		// Falta implementar..
		return 0;
	}

	public Integer nivel(T dato) {
		// falta implementar
		return -1;
	}

	public Integer ancho() {
		// Falta implementar..
		return 0;
	}

	
	private void recorridoPreOrden(ListaEnlazadaGenerica<T> lista) {
		lista.agregarFinal(this.getDato());
		ListaGenerica<ArbolGeneral<T>> aux = this.getHijos();
		aux.comenzar();
		while (!aux.fin() && !aux.esVacia()) {
			aux.proximo().recorridoPreOrden(lista);
		}
	}
	
//	public ListaEnlazadaGenerica<T> preOrden() {
//		ListaEnlazadaGenerica<T> lista = new ListaEnlazadaGenerica<T>();
//		lista.comenzar();
//		recorridoPreOrden(lista);
//		return lista;	
//		
//	}
//	
//
//	public ListaEnlazadaGenerica<T> inOrden(){
//		ListaEnlazadaGenerica<T> lista = new ListaEnlazadaGenerica<T>();
//		lista.comenzar();
//		recorridoInOrden(lista);
//		return lista;
//	}
	
//	public void recorridoInOrden(ListaEnlazadaGenerica<T> lista) {										//      2
//		if esta vacio
//			no hago nada
//		
//		if es hoja, es el primer hijo?
//			imprimo y luego paso al siguiente
//			retorno al siguiente
//		
//		if es raiz?
//				retorno la raiz
//				
//		if es hoja, es otro hijo?
//			retorno ese hijo
//		
//		}


		
}
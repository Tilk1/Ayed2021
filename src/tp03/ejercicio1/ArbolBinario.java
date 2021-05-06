package tp03.ejercicio1;

import tp02.ejercicio2.ColaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio2.PilaGenerica;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;
	private ArbolBinario<T> hijoDerecho;

	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * 
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo != null;
	}

	public boolean tieneHijoDerecho() {
		return this.hijoDerecho != null;
	}

	public boolean esLleno() {
		return false;
	}

	boolean esCompleto() {
		return false;
	}

	// imprime el árbol en preorden
	public void printPreorden() {
		printPreorden(this);

	}

	private void printPreorden(ArbolBinario<T> arbol) {
		if (arbol != null) {
			if (!arbol.esVacio()) {
				if (arbol.esHoja()) {
					System.out.println(arbol.getDato());

				} else {
					System.out.println(arbol.getDato());
					printPreorden(arbol.getHijoIzquierdo());
					printPreorden(arbol.getHijoDerecho());

				}
			}
		}

	}

	public void printPostorden() {
		printPostorden(this);
	}

	private void printPostorden(ArbolBinario<T> arbol) {
		if (arbol != null) {
			if (!arbol.esVacio()) {
				if (arbol.esHoja()) {
					System.out.println(arbol.getDato());

				} else {

					printPostorden(arbol.getHijoIzquierdo());
					printPostorden(arbol.getHijoDerecho());
					System.out.println(arbol.getDato());

				}
			}
		}

	}

	public void printInorden() {
		printInorden(this);

	}

	private void printInorden(ArbolBinario<T> arbol) {
		if (arbol == null || arbol.esVacio()) {
			// nada
		} else {
			if (arbol.esHoja()) {
				System.out.println(arbol.getDato());
			} else {
				// No es vacio
				// no es hoja
				printInorden(arbol.getHijoIzquierdo());
				System.out.println(arbol.getDato());
				printInorden(arbol.getHijoDerecho());
			}

		}

	}

	public void entreNiveles(int n, int m) {
		ArbolBinario<T> aux;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		if (this.esVacio()) {
			// nada;
		} else {
			cola.encolar(this);
			cola.encolar(null);
			int nivel = 0;
			while ((!cola.esVacia()) & (nivel <= m)) {
				aux = cola.desencolar();
				if (aux != null) {
					if (nivel >= n & nivel <= m)
						System.out.println(nivel + " " + aux.getDato());
					if (aux.getHijoIzquierdo() != null && !aux.getHijoIzquierdo().esVacio()) {
						cola.encolar(aux.getHijoIzquierdo());
					}
					if (aux.getHijoDerecho() != null && !aux.getHijoDerecho().esVacio()) {
						cola.encolar(aux.getHijoDerecho());
					}
				} else {
					nivel++;
					if (!cola.esVacia()) {
						cola.encolar(null);
					}
				}

			}
		}
	}
	
	

	public void recorridoPorNiveles() {
		recorridoPorNiveles(this);
	}
	
	private void recorridoPorNiveles(ArbolBinario<T> arbol) {
		ArbolBinario<T> aux;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		
		if (arbol.esVacio()) {
			// nada;
		} else {
			cola.encolar(arbol);
			cola.encolar(null);
			
			while ((!cola.esVacia())) {
				aux = cola.desencolar();
				if (aux != null) {
					System.out.println(aux.getDato());
					//primerElementoUltimoNivel = (int) aux.getDato();
					
					if (aux.getHijoIzquierdo() != null && !aux.getHijoIzquierdo().esVacio()) {
						cola.encolar(aux.getHijoIzquierdo());
					}
					if (aux.getHijoDerecho() != null && !aux.getHijoDerecho().esVacio()) {
						cola.encolar(aux.getHijoDerecho());
					}
					
				} else {
					System.out.println("nuevo nivel");
					if (!cola.esVacia()) {
						cola.encolar(null);
					}
				}
				
			}
		}
		
		
	}

	public ListaGenerica<T> frontera() {
		ListaGenerica<T> l = new ListaEnlazadaGenerica<T>();

		return l;
	}

	public int contarHojas(){
		return contarHojas(this);
	}
	
	
	private int contarHojas(ArbolBinario<T> arbol) {
		int cantidadHojas = 0;
		if (arbol == null || arbol.esVacio()) {
			return 0;}
		if (arbol.esHoja()) { // es solo una hoja
			return 1;
		} else {
			// no es vacio
			// ni es hoja
			cantidadHojas +=  contarHojas(arbol.getHijoIzquierdo());
			cantidadHojas +=  contarHojas(arbol.getHijoDerecho());
		}
		return cantidadHojas;
	}

	public ArbolBinario<T> espejo(ArbolBinario<T> arbol) {
		if (arbol == null || arbol.esVacio())
			return null;
		ArbolBinario<T> aux = new ArbolBinario<T>(arbol.getDato());
		if (arbol.esHoja())
			return arbol;
		else {
			ArbolBinario<T> espejoHI = espejo(arbol.getHijoIzquierdo());
			ArbolBinario<T> espejoHD = espejo(arbol.getHijoDerecho());
			aux.agregarHijoIzquierdo(espejoHD);
			aux.agregarHijoDerecho(espejoHI);
			return aux;
		}
	}

	public int cantidadHijosPares() {
		return cantidadHijosPares(this);
	}

	private int cantidadHijosPares(ArbolBinario<T> arbol) {
		int cant = 0;
		if (arbol != null) {
			if (!arbol.esVacio()) {
				if (arbol.esHoja()) {
					return 1;
				}
				else {
					cant += cantidadHijosPares(arbol.getHijoIzquierdo());
					if (arbol.tieneHijoDerecho() && arbol.tieneHijoIzquierdo()) {
						cant++;
					}
					cant += cantidadHijosPares(arbol.getHijoDerecho());
				}
			}
		}
		return cant;
	}

	public int cantidadHijosPares2() {
		int cant = 0;
		if (this.tieneHijoIzquierdo())
			cant += this.getHijoIzquierdo().cantidadHijosPares2();
		if (this.esHoja())
			cant++;
		if (this.tieneHijoIzquierdo() && this.tieneHijoDerecho())
			cant++;
		if (this.tieneHijoDerecho())
			cant += this.getHijoDerecho().cantidadHijosPares2();
		return cant;
	}

	public int contadorOcurrencias(String elem) {
		return contadorOcurrencias(this, elem);
	}

	private int contadorOcurrencias(ArbolBinario<T> arbol, String elem) {
		int cant = 0;
		if (arbol == null) {
			return cant;
		}
		if (!arbol.esVacio()) {
			if (arbol.esHoja()) {
				if (arbol.getDato() == elem) {
					cant++;
				}
			} else {
				cant += contadorOcurrencias(arbol.getHijoIzquierdo(), elem);
				cant += contadorOcurrencias(arbol.getHijoDerecho(), elem);
				if (arbol.getDato() == elem) {
					cant++;
				}
			}
		}
		return cant;
	}

	public Integer buscar() {
		return buscar(this);
	}
	
	private Integer buscar(ArbolBinario<T> arbol) {
		int minimo = 9999;
		if (arbol == null || arbol.esVacio()) {
			return minimo;
		} else {
			if (arbol.esHoja()) {
				minimo = Math.min(minimo, (int) arbol.getDato());
				
			} else {
				// No es vacio
				// no es hoja
				minimo = Math.min(minimo, buscar(arbol.getHijoIzquierdo()));
				minimo = Math.min(minimo, (int) arbol.getDato());
				minimo = Math.min(minimo, buscar(arbol.getHijoDerecho()));
			}
		}
	return minimo;
	}
	


}

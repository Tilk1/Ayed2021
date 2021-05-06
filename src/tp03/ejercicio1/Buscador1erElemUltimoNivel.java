package tp03.ejercicio1;
import tp02.ejercicio2.ColaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;
/**
 * Ejercicio parcial
 * @author SAN
 * @ENUNCIADO: @link https://i.imgur.com/JYiHLTr.png
 */
public class Buscador1erElemUltimoNivel {
	private ArbolBinario<Integer> arbol;

	
	//para testear
	// ARBOL BINARIO DE NUMEROS 
	//        20
	//    7        15
	// 12   6    40   10
	//	   	   41   
	
	public ArbolBinario<Integer> getArbol() {
		return arbol;
	}


	public void setArbol(ArbolBinario<Integer> arbol) {
		this.arbol = arbol;
	}


	public void agregarHijos() {
		arbol = new ArbolBinario<Integer>(20);
		ArbolBinario<Integer> a7 = new ArbolBinario<Integer>(7);
		ArbolBinario<Integer> a15 = new ArbolBinario<Integer>(15);
		ArbolBinario<Integer> a12 = new ArbolBinario<Integer>(12);
		ArbolBinario<Integer> a6 = new ArbolBinario<Integer>(6);
		ArbolBinario<Integer> a10 = new ArbolBinario<Integer>(10);
		ArbolBinario<Integer> a40 = new ArbolBinario<Integer>(40);
		ArbolBinario<Integer> a41 = new ArbolBinario<Integer>(41);
		arbol.agregarHijoIzquierdo(a7);
		arbol.agregarHijoDerecho(a15);
		a7.agregarHijoIzquierdo(a12);
		a7.agregarHijoDerecho(a6);
		a15.agregarHijoDerecho(a10);
		a15.agregarHijoIzquierdo(a40);
		a40.agregarHijoIzquierdo(a41);
	}
	
	
	public Integer buscarPrimerElementoUltimoNivel(){
		return buscarPrimerElementoUltimoNivel(getArbol());
	}
	
	private Integer buscarPrimerElementoUltimoNivel(ArbolBinario<Integer> arbol) {
		ArbolBinario<Integer> aux;
		ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		if (arbol.esVacio()) {
			// nada;
		} else {
			cola.encolar(arbol);
			cola.encolar(null);
			
			while ((!cola.esVacia())) {
				aux = cola.desencolar();
				if (aux != null) {
					lista.agregarFinal(aux.getDato());
					System.out.println(aux.getDato());
					
					if (aux.getHijoIzquierdo() != null && !aux.getHijoIzquierdo().esVacio()) {
						cola.encolar(aux.getHijoIzquierdo());
					}
					if (aux.getHijoDerecho() != null && !aux.getHijoDerecho().esVacio()) {
						cola.encolar(aux.getHijoDerecho());
					}
					
				} else {
					if (!cola.esVacia()) { //se ejecuta siempre en cada nivel menos en el ultimo
						System.out.println("nuevo nivel");
						cola.encolar(null);
						lista.comenzar();
						lista = new ListaEnlazadaGenerica<Integer>();
					}
				}
			}
		}
		lista.comenzar();
		return lista.proximo();
	}
	

	
	public static void main(String[] args) {
		Buscador1erElemUltimoNivel arbolito = new Buscador1erElemUltimoNivel();
		arbolito.agregarHijos();
		System.out.println(arbolito.buscarPrimerElementoUltimoNivel());
		
	}

}

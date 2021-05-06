package tp03.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;

public class RedBinariaLlena {
	private ArbolBinario<Integer> arbol;
	
	
	
	//para testear
	// ARBOL BINARIO DE NUMEROS LLENO!!!
	//        20
	//    7        15
	// 12   6    40   10
	//	   		   
	
	public void agregarHijos() {
		arbol = new ArbolBinario<Integer>(20);
		ArbolBinario<Integer> a7 = new ArbolBinario<Integer>(7);
		ArbolBinario<Integer> a15 = new ArbolBinario<Integer>(15);
		ArbolBinario<Integer> a12 = new ArbolBinario<Integer>(12);
		ArbolBinario<Integer> a6 = new ArbolBinario<Integer>(6);
		ArbolBinario<Integer> a10 = new ArbolBinario<Integer>(10);
		ArbolBinario<Integer> a40 = new ArbolBinario<Integer>(40);
		arbol.agregarHijoIzquierdo(a7);
		arbol.agregarHijoDerecho(a15);
		a7.agregarHijoIzquierdo(a12);
		a7.agregarHijoDerecho(a6);
		a15.agregarHijoDerecho(a10);
		a15.agregarHijoIzquierdo(a40);
	}
	
	public int retardoReenvio() {
		if (!arbol.esVacio())
			return retardoReenvio(arbol);
		else
			return 0;
	}
	
	//---------camino q va por los nodos mas grandes
//	private int retardoReenvio(ArbolBinario<Integer> arbol) { //Tiene q ser lleno
//		int suma = 0;
//		if(arbol == null) {
//			return 0;
//		}
//		if (arbol.esHoja()) {
//			return suma += arbol.getDato();
//		}
//		if (arbol.getHijoIzquierdo().getDato() > arbol.getHijoDerecho().getDato()) {
//			suma += arbol.getDato();
//			suma += retardoReenvio(arbol.getHijoIzquierdo());
//		}
//			else
//			{
//				suma += arbol.getDato();
//				suma += retardoReenvio(arbol.getHijoDerecho());
//			}
//		return suma;
//	}
	
	
	private int retardoReenvio(ArbolBinario<Integer> arbol) { //Tiene q ser lleno
		if (arbol == null) {
			return 0;
		}
		if (arbol.esHoja()){
			return arbol.getDato(); //corte
		}
		else {
			int rhi = retardoReenvio(arbol.getHijoIzquierdo());
			int rhd = retardoReenvio(arbol.getHijoDerecho());
			int max = Math.max(rhi, rhd);
			return max + arbol.getDato(); //sumo mi raiz
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		RedBinariaLlena arbol = new RedBinariaLlena();
		arbol.agregarHijos();
		System.out.println(arbol.retardoReenvio());
		

	}

}

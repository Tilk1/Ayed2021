package tp03.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
/**
* Ejercico parcial y practica 3-4  Contador numeros Pares de un arbol
* @author SAN
* @ENUNCIADO: https://i.imgur.com/MSYxGET.png   (Ctrl click abrirlo)
*/
public class ContadorArbol {
	private ArbolBinario<Integer> arbol;
	

	//para testear
	// ARBOL BINARIO DE NUMEROS
	//        20
	//    7        15
	//12     6		 10
	//	   		   40
	
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
		a10.agregarHijoIzquierdo(a40);
	}
	
	public ListaEnlazadaGenerica<Integer> numerosPares(){
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		lista.comenzar();
		numerosPares(arbol,lista);
		return lista;
	}
	
	
	//--------------------PRE-ORDEN------------ 
	/*
	private ListaEnlazadaGenerica<Integer> numerosPares(ArbolBinario<Integer> arbol,ListaEnlazadaGenerica<Integer> lista) {
		if (arbol != null) {
			if (!arbol.esVacio()) {
				if (arbol.esHoja()) {
					if(arbol.getDato() % 2 == 0)
						lista.agregarFinal(arbol.getDato());}
				 else {
					if(arbol.getDato() % 2 == 0)
						lista.agregarFinal(arbol.getDato());
					numerosPares(arbol.getHijoIzquierdo(),lista);
					numerosPares(arbol.getHijoDerecho(),lista);
				 }
			}
		}
		return lista;
	} 
	*/
	
	
	//--------------------INORDEN----------------------------
	
	/*
	private ListaEnlazadaGenerica<Integer> numerosPares(ArbolBinario<Integer> arbol,ListaEnlazadaGenerica<Integer> lista) {
		if (arbol != null) {
			if (!arbol.esVacio()) {
				if (arbol.esHoja()) {
					if(arbol.getDato() % 2 == 0)
						lista.agregarFinal(arbol.getDato());}
				 else {
					numerosPares(arbol.getHijoIzquierdo(),lista);
					if(arbol.getDato() % 2 == 0)
						lista.agregarFinal(arbol.getDato());
					numerosPares(arbol.getHijoDerecho(),lista);
				 }
			}
		}
		return lista;
	}
	
	*/
	
	//--------------------POS-ORDEN-----------------------------
	
	
	private ListaEnlazadaGenerica<Integer> numerosPares(ArbolBinario<Integer> arbol,ListaEnlazadaGenerica<Integer> lista) {
		if (arbol != null) {
			if (!arbol.esVacio()) {
				if (arbol.esHoja()) {
					if(arbol.getDato() % 2 == 0)
						lista.agregarFinal(arbol.getDato());}
				 else {
					numerosPares(arbol.getHijoIzquierdo(),lista);
					numerosPares(arbol.getHijoDerecho(),lista);
					if(arbol.getDato() % 2 == 0)
						lista.agregarFinal(arbol.getDato());
				 }
			}
		}
		return lista;
	}
	
	
	public static void main(String[] args) {
		ContadorArbol arbol = new ContadorArbol();
		arbol.agregarHijos();
		ListaEnlazadaGenerica<Integer> lista = arbol.numerosPares();
		lista.comenzar();
		while (!lista.fin())
			System.out.println(lista.proximo());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

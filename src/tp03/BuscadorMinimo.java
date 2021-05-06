package tp03;
/**
 * Ejercicio parcial
 * @author SAN
 * @ENUNCIADO: https://i.imgur.com/Hy1MA2n.png   (Ctrl click abrirlo)
 */

public class BuscadorMinimo {
	private ArbolBinario<Integer> arbol;
	//para testear
	// ARBOL BINARIO DE NUMEROS 
	//        20
	//    7        15
	// 12   6    40   10
	//	   	   41
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
		arbol.printPreorden();
	}
	
	
	
	public Integer buscar() {
		return buscar(arbol);
	}
	
	private Integer buscar(ArbolBinario<Integer> arbol) {
		int minimo = 9999;
		if (arbol == null || arbol.esVacio()) {
			return minimo;
		} else {
			if (arbol.esHoja()) {
				minimo = Math.min(minimo, (int) arbol.getDato());
				
			} else {
				// No es vacio
				// no es hoja
				
				minimo = Math.min(buscar(arbol.getHijoIzquierdo()), buscar(arbol.getHijoDerecho()));//esto seria preorden
				//minimo = Math.min(minimo, buscar(arbol.getHijoIzquierdo()));  //inorden
				minimo = Math.min(minimo, (int) arbol.getDato());
				//minimo = Math.min(minimo, buscar(arbol.getHijoDerecho()));    //inorden
			}
		}
	return minimo;
	}
	
	public static void main(String[] args) {
		BuscadorMinimo arbolito = new BuscadorMinimo();
		arbolito.agregarHijos();
		System.out.println("minimo: "+ arbolito.buscar());

	}

}

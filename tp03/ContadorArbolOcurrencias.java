package tp03;
/**
 * Ejercicio parcial?
 * @author SAN
 * @ENUNCIADO: https://i.imgur.com/FSA2sHq.png   (Ctrl click abrirlo)
 */

public class ContadorArbolOcurrencias {
	private ArbolBinario<String> arbol;


public void agregarHijos() {
	// ARBOL DE NOMBRES
	//       juan          
	//	 pepe     cacho
	//maki  rob			pipi
	//				 sal
	arbol = new ArbolBinario<String>("juan");
	ArbolBinario<String> pepe = new ArbolBinario<String>("pepe");
	ArbolBinario<String> cacho = new ArbolBinario<String>("cacho");
	ArbolBinario<String> maki = new ArbolBinario<String>("maki");
	ArbolBinario<String> rob = new ArbolBinario<String>("rob");
	ArbolBinario<String> pipi = new ArbolBinario<String>("pipi");
	ArbolBinario<String> sal = new ArbolBinario<String>("sal");
	
	arbol.agregarHijoIzquierdo(pepe);
	arbol.agregarHijoDerecho(cacho);
	pepe.agregarHijoIzquierdo(maki);
	pepe.agregarHijoDerecho(rob);
	cacho.agregarHijoDerecho(pipi);
	pipi.agregarHijoIzquierdo(sal);

	arbol.printPreorden();
}

public int contadorOcurrencias(String elem) {
	return contadorOcurrencias(arbol, elem);
}

private int contadorOcurrencias(ArbolBinario<String> arbol, String elem) {
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



public static void main(String[] args) {
	ContadorArbolOcurrencias arbolito = new ContadorArbolOcurrencias();
	arbolito.agregarHijos();
	System.out.println(arbolito.contadorOcurrencias("juan"));
	
	
}





}
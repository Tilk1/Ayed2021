package tp03.ejercicio1;

public class testAB {

	public static void main(String[] args) {
		// ARBOL DE NOMBRES
		ArbolBinario<String> juan = new ArbolBinario<String>("juan");
		ArbolBinario<String> pepe = new ArbolBinario<String>("pepe");
		ArbolBinario<String> cacho = new ArbolBinario<String>("cacho");
		ArbolBinario<String> maki = new ArbolBinario<String>("maki");
		ArbolBinario<String> rob = new ArbolBinario<String>("rob");
		ArbolBinario<String> pipi = new ArbolBinario<String>("pipi");
		ArbolBinario<String> sal = new ArbolBinario<String>("sal");
		
		//       juan          
		//	 pepe     cacho
		//maki  rob			pipi
		//				 sal
		
		juan.agregarHijoIzquierdo(pepe);
		juan.agregarHijoDerecho(cacho);
		pepe.agregarHijoIzquierdo(maki);
		pepe.agregarHijoDerecho(rob);
		cacho.agregarHijoDerecho(pipi);
		pipi.agregarHijoIzquierdo(sal);
		
		// ARBOL BINARIO DE NUMEROS
		//        20
		//    7        15
		//12     6		 10
		//	   		   40

		ArbolBinario<Integer> a20 = new ArbolBinario<Integer>(20);
		ArbolBinario<Integer> a7 = new ArbolBinario<Integer>(7);
		ArbolBinario<Integer> a15 = new ArbolBinario<Integer>(15);
		ArbolBinario<Integer> a12 = new ArbolBinario<Integer>(12);
		ArbolBinario<Integer> a6 = new ArbolBinario<Integer>(6);
		ArbolBinario<Integer> a10 = new ArbolBinario<Integer>(10);
		ArbolBinario<Integer> a40 = new ArbolBinario<Integer>(40);
		
		a20.agregarHijoIzquierdo(a7);
		a20.agregarHijoDerecho(a15);
		a7.agregarHijoIzquierdo(a12);
		a7.agregarHijoDerecho(a6);
		a15.agregarHijoDerecho(a10);
		a10.agregarHijoIzquierdo(a40);
		
		
		//imprimirPreorden(juan);
		//System.out.println(juan.contarHojas());
		
		//System.out.println(imprimirPreorden(juan));
		//juan.entreNiveles(0, 3);
		//System.out.println(juan.cantidadHijosPares());
		//juan.printInorden();
		//System.out.println(juan.cantidadHijosPares());
		//System.out.println(juan.contadorOcurrencias("pepe"));
		
		//a20.printInorden();
		//System.out.println(a20.buscar());
		
		//a20.recorridoPorNiveles();
		//System.out.println(a20.contarHojas());
		
		ArbolBinario<String> espejoJuan = juan.espejo(juan);
		espejoJuan.printPreorden();
		
		
	}

	
	public static int imprimirPreorden(ArbolBinario<String> raiz) {
		int num = 0;
		if (raiz == null || raiz.esVacio()) {
			// nada
		}
		else {
		if(raiz.esHoja()) {
				System.out.println(raiz.getDato());
			}
		else {
			//No es vacio
			//Ni es hoja
			System.out.println(raiz.getDato());
			if (raiz.tieneHijoDerecho() && raiz.tieneHijoIzquierdo()) {
				num++;
			
			}
			imprimirPreorden(raiz.getHijoIzquierdo());
			imprimirPreorden(raiz.getHijoDerecho());
			}
		}
		return num;
	}
	
	

	
	
	
	
}

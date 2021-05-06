package tp04;

import tp02.ColaGenerica;
import tp02.ListaGenerica;

public class TestArbolGeneral {

	public static void main(String[] args) {
		ArbolGeneral<Integer> a3 = new ArbolGeneral<Integer>(3);
		ArbolGeneral<Integer> a1 = new ArbolGeneral<Integer>(1);
		ArbolGeneral<Integer> a2 = new ArbolGeneral<Integer>(2);
		
		a2.agregarHijo(a3);
		a2.agregarHijo(a1);
		
		//    2 
		//  3   1
		//
		ListaGenerica<ArbolGeneral<Integer>> hijos = a2.getHijos();
		hijos.comenzar();
		while (!hijos.fin()) {
			System.out.println(hijos.proximo().getDato());
		}
		
		
		
		ColaGenerica<Integer> b1 = new ColaGenerica<Integer>();
		System.out.println(b1.esVacia());
		b1.encolar(2);
		b1.encolar(3);
		System.out.println(b1.esVacia());
	}

	
	
	
	
}

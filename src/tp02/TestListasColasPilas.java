package tp02;

public class TestListasColasPilas {

	public static void main(String[] args) {
		//CREO LISTA, IMPRIMO LISTA
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		lista.agregarFinal(2);
		lista.agregarFinal(3);
		lista.agregarFinal(4);
		lista.comenzar();
		while (!lista.fin()) {
			System.out.println(lista.proximo());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

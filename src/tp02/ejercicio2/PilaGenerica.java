package tp02.ejercicio2;

import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;

public class PilaGenerica<T> {
	
    private ListaGenerica<T> datos = new ListaEnlazadaGenerica<T>();


     public boolean esVacia(){

          return  this.datos.esVacia();
     }


     public void apilar(T valor){

         this.datos.agregarFinal(valor);
         }

     public T desapilar(){
         T aux;


        aux= this.datos.elemento(datos.tamanio());

        this.datos.eliminarEn(datos.tamanio());

          return aux;

     }

     public T tope ( ) {
        T aux;

        aux= this.datos.elemento(datos.tamanio());
        return aux;


        }
	

}

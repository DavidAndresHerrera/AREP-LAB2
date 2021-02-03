package edu.escuelaing.arep;



import java.util.*;

public class Lista {

    private Puntero cabeza;
    private Puntero cola;
    private Puntero actual;
    private double tamano;
    private Collection<Puntero> listaEnlazada;

    /**
    * Constructor de la clase Lista
     */
   public Lista(){
       cabeza = null;
       cola = null;
       actual = null;
       tamano = 0.0;
   }

    /**
     * Metodo encargado de añadir un nuevo puntero a la lista, se añade la cola y el actual dependiendo del estado de la lista
     * @param puntero
     */
    public void add(Puntero puntero) {
        if( tamano == 0){
            cabeza = puntero;
            cola = puntero;
            actual = puntero;
        }
        else {
            if (cola != null) {
                cola.setSiguiente(puntero);
                puntero.setAnterior(cola);
                cola = puntero;
            }
        }
        tamano += 1;

    }

    /**
     * Metodo encargado de retornar el tamaño de la lista
     * @return tamaño de la lista
     */
    public double size(){
        return tamano;
    }

    /**
     * Metodo encargado de dar la posicion del puntero dentro de la lista, esete va a depender del estado de la lista
     * @return puntero
     */
    public Puntero getEnCola() {
       Puntero respuesta = null;
       if(actual != null){
           respuesta = actual;
           setActual(actual.getSiguiente());
       }
       else{
           respuesta=cabeza;
       }
       return respuesta;
    }

    /**
     * Metodo encargado de actualizar la informacion del puntero siguente en la lista
     * @param siguiente
     */
    private void setActual(Puntero siguiente) {
        this.actual = siguiente;
    }

    /**
     * Metodo encargado en resetear la info del puntero actual y la cola
     */
    public void resetActual(){
       this.actual = cabeza;
       this.cola = cabeza;
    }
}

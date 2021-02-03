package edu.escuelaing.arep;

public class Puntero {



    private Puntero siguiente;
    private Puntero anterior;
    private double valor;

    /**
     * Constructor de los pnteros
     * @param valor
     */
    public Puntero(double valor) {
        this.valor = valor;
        this.siguiente = null;
        this.anterior = null;
    }

    /**
     * Metodo encargado de retornar el dato del puntero
     * @return valor
     */
    public double getDato() {
        return valor;
    }

    /**
     * Metodo encargado de cambiar el puntero anterior al actual
     * @param anterior
     */
    public void setAnterior(Puntero anterior) {
        this.anterior = anterior;
    }

    /**
     * Metodo encargado de cambiar el puntero siguente al actual
     * @param siguiente
     */
    public void setSiguiente(Puntero siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * Metodo encargado de retornar el puntero siguiente
     * @return PunteroSiguente
     */
    public Puntero getSiguiente() {
        return siguiente;
    }

    /**
     * Metodo encargado en retornar el puntero anterior
     * @return PunteroAnterior
     */
    public Puntero getAnterior() {
        return anterior;
    }

    /**
     * Metodo encargado de cambiar el valor del puntero
     * @param valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
}

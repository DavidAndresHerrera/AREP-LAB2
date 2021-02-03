package edu.escuelaing.arep;



public class Calculardora {
    private Lista valores ;

    /**
     * Constructor de la clase Calculadora y se encarga de construir la lista que se va a utilizar en la operaciones
     * @param datos
     */
    public Calculardora(String[] datos){

        valores = new Lista();
        for (String valor : datos) {
            valores.add(new Puntero(Double.parseDouble(valor)));
        }
    }

    /**
     * Metodo encargado de calcular la media de la lista que entro
     * @return total de la operacion
     */
    public double media(){
        double totalMedia = 0.0;
        Puntero temp = valores.getEnCola();
        int cont1 = 0;
        while (cont1 < valores.size()) {

            totalMedia += temp.getDato();
            temp = valores.getEnCola();
            cont1 ++;
        }
        double totalMediaRes = totalMedia/valores.size();
        return totalMediaRes;


    }

    /**
     * Metodo encargado de calcular la desviacion estandar de la lista que entro
     * @return valor total de la operacion
     */
    public double desviacionEstandar(){
        Double media = media();
        valores.resetActual();
        Double totalDsvEst = 0.0;
        Puntero temp = valores.getEnCola();
        int cont = 0;
        while (cont < valores.size()) {
            totalDsvEst += Math.pow(temp.getDato()-media,2);
            temp = valores.getEnCola();
            cont ++;
        }
        Double total = Math.sqrt(totalDsvEst/(valores.size()-1));
        return total;
    }

}

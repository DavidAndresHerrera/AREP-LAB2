package edu.escuelaing.arep;

import spark.Request;
import spark.Response;

import static spark.Spark.*;
import edu.escuelaing.arep.Calculardora;

public class SparkWeb {


    /**
     * Metodo que se encarga de llamar los gets de la pagina, y estos muestran el html
     * @param args
     */
    public static void main(String[] args) {
        port(getPort());
        get("/", (request, response) -> initPage(request, response));
        get("/Calculos",(request, response) -> finalPage(request,response));
    }

    /**
     * Este metodo se encarga de cargar la pagina principal del trabajo, en esta se van a encontrar
     * dos cosas distintas, un cuadro de texto para que el usuario ingrese los datos a evaluar, y el boton de calcular para encontrar cada calculo
     * @param req
     * @param res
     * @return
     */
    private static Object initPage(Request req, Response res) {
        String paginaDatos = "<!DOCTYPE html>"
                +"<html>"
                + "<title> Calculadora</title>"
                + "<body>"
                +"<h1>Ingrese la lista</h1>"
                +"<form action=\"/Calculos\">"
                +"<label for=\"ldatos\">Escriba la lista a operar separando los numeros por comas: </label>"
                + "<input type=\"text\" id=\"ldatos\" name=\"ldatos\"><br><br>"
                + "<input type=\"submit\" value=\"Submit\">"
                +"</form>"
                +"</body>"
                +"</html>";
        return paginaDatos;
    }

    /**
     * Metodo se encarga de carga la pagina con los resultados de la lista que el usuario inserto
     * @param req
     * @param res
     * @return
     * @throws Exception
     */
    private static String finalPage(Request req, Response res) throws Exception {
        String request = req.queryParams("ldatos");
        String[] lista = request.split(",");
        Calculardora calculadora = new Calculardora(lista);
        String paginaDatos = "<DOCTYPE html"
                + "<html>"
                + "<title> Las operaciones son </title>"
                + "<body>"
                + "<h1>Resultados</h1>"
                + "<h3>Media de la lista :</h3>"
                + "<h3>"+ calculadora.media() + "</h3>"
                + "<h3>Desviación Estandar de la lista: </h3>"
                + "<h3>"  + calculadora.desviacionEstandar() + "</h3>"
                + "</body>"
                + "</html>";
        return paginaDatos;
    }

    /**
     * metodo se encarga de retornar el puerto por el cual se va a correr la pagina
     * @return
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
    
    
    
}

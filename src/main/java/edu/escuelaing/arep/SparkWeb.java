package edu.escuelaing.arep;

import spark.Request;
import spark.Response;

import static spark.Spark.*;
import edu.escuelaing.arep.Calculardora;

public class SparkWeb {



    public static void main(String[] args) {
        port(getPort());
        get("/", (request, response) -> initPage(request, response));
        get("/Calculos",(request, response) -> finalPage(request,response));
    }

    private static Object initPage(Request req, Response res) {
        String paginaDatos = "<!DOCTYPE html>"
                +"<html>"
                + "<title> Calculadora</title>"
                + "<body>"
                +"<h1>Ingrese la lista</h1>"
                +"<form action=\"/resultado\">"
                +"<label for=\"ldatos\">Escriba la lista a operar separando los numeros por comas: </label>"
                + "<input type=\"text\" id=\"ldatos\" name=\"ldatos\"><br><br>"
                + "<input type=\"submit\" value=\"Submit\">"
                +"</form>"
                +"</body>"
                +"</html>";
        return paginaDatos;
    }
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
        return paginaDatos;    }
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
    
    
    
}

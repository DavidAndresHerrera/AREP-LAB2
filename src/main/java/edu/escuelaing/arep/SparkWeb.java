package edu.escuelaing.arep;

import spark.Request;
import spark.Response;

import static spark.Spark.*;
import edu.escuelaing.arep.Calculardora;

public class SparkWeb {



    public static void main(String[] args) {
        port(getPort());
        get("/", (req, res) -> initPage(req, res));
    }

    private static Object initPage(Request req, Response res) {
        String paginaDatos = "<!DOCTYPE html>"
                +"<html>"
                + "<title> Calculadora</title>"
                + "<body>"
                +"<h1>Ingrese la lista</h1>"
                +"<form action=\"/resultado\">"
                +"<label for=\"lista\">Escriba la lista a operar separando los numeros por comas: </label>"
                +"<input type=\"text\" id=\"datos\" name=\"datos\"><br><br>"
                + "<input type=\"submit\" value=\"Operar\">"
                +"</form>"
                +"</body>"
                +"</html>";
        return paginaDatos;
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
    
    
    
}

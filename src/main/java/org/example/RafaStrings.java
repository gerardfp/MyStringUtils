package org.example;

public class RafaStrings {
    /**
     * Pone en mayuscula la primera letra del string.
     * Siempre y cuando la primera letra sea alfabetica
     *
     * @param str El String que hay que capitalizar
     * @return El String capitalizado
     */
    public static String capitalizar(String str){
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public static String rojo(String str) {
        return "\033[31m" + str + "\033[0m";
    }

    public static String verde(String str) {
        return "\033[32m" + str + "\033[0m";
    }

    /**
     * Centra un texto en un ancho determinado
     * @param texto El texto a centrar
     * @param width El ancho total
     * @return El texto centrado
     */
    public static String centrar(String texto, int width) {
        return " ".repeat((width-texto.length())/2) + texto +" ".repeat((width-texto.length())/2);
    }
}

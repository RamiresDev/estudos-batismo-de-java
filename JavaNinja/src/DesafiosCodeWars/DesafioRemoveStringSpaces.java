package DesafiosCodeWars;

public class DesafioRemoveStringSpaces {
    public static String noSpace(final String x) {
        // Objetivo: Escreva uma função que remova os espaços da string e depois retorne a string resultante.
        return x.replaceAll("\\s+","");
    }
}

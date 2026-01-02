package DesafiosCodeWars;

public class SentenceSmash {
    public static String smash(String... words) {
        String resultado = "";
        for (int i = 0; i < words.length; i++) {
            resultado += words[i]+" ";
        }
        return resultado.trim();
    }
}

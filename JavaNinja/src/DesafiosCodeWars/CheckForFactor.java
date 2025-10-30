package DesafiosCodeWars;

public class CheckForFactor {
    public static boolean checkForFactor(int base, int factor) {
        boolean saida = false;

        if (base % factor == 0){
            saida = true;
        }
        return saida;
    }
}

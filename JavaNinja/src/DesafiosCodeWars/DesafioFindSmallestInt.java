package DesafiosCodeWars;

public class DesafioFindSmallestInt {
    public static int findSmallestInt(int[] args) {
        // Entrada: Array com números aleátorios
        int menorValor = args[0];
        // Processamento: descobrir qual o menor desses números
        for (int i = 0; i < args.length; i++) {
            if (args[i] < menorValor) {
                menorValor = args[i];
            }
        }
        // Saída: O menor número descoberto
        return menorValor;
    }

    static void main(String[] args) {
        int[] array = {34, 15, 88, 2};
        System.out.println(findSmallestInt(array));
    }


}

package NivelBasico;

public class Array {
    public static void main(String[] args) {

        // Arrays são tipo referência

        //Estrutura básica do Array
        // String inicializa como NULL
        String[] ninja = new String[6];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";
        System.out.println(ninja[5]);

        //Redeclarar o array
        //
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade Senju";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";

        System.out.println(ninja[5]);

        // For para fazer um LOOP no array

        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }

        // Array idade
        //int inicializa como 0
        int[] idade = new int[2];
        idade[0] = 16;
        //idade[1] = 15;
        System.out.println(idade[1]);

        // Inicializa como FALSE
        boolean[] verdadeiroOuFalso = new boolean[2];
        System.out.println(verdadeiroOuFalso[1]);

        // Doubles inicializam como 0.0
        double[] peso = new double[5];
        System.out.println(peso[2]);



    }
}

package DesafiosCodeWars;

import java.util.Scanner;

public class DesafioNumberToString {
        public static String numberToString(int num) {
            // Processamento = transformar esse número em String
            return Integer.toString(num); // Return a string of the number here!
        }

    static void main() {
        Scanner input = new Scanner(System.in);
        // Entrada = receber um número
        System.out.println("Insira o número: ");
        int numero = input.nextInt();


        // Saída = Número convertido em String
        System.out.println(numberToString(numero));

    }
}

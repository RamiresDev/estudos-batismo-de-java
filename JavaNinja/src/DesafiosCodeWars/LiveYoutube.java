package DesafiosCodeWars;

import java.util.Scanner;

public class LiveYoutube {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        boolean fim = true;

        while (fim){
            System.out.print("Insira o tipo de combustível a ser abastecido: ");
            int resposta = entrada.nextInt();
            switch (resposta){
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    System.out.println("MUITO OBRIGADO \nAlcool: " + alcool + "\nGasolina: " + gasolina + "\nDiesel: " + diesel);
                    fim = false;
                    break;
                default:
                    System.out.println("Valor inserido não corresponde a nenhum combustível.");
                    break;
            }
        }
    }
}

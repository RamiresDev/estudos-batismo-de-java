package DesafiosCodeWars;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioReversedSequence {
    /*Crie uma função que retorne uma matriz de inteiros de "n" a 1 onde n>0.
    Exemplo: n=5-->[5,4,3,2,1]*/

    /*
    * Processamento: Basicamente tenho que fazer um loop for para percorrer o array e imprimir o números, sendo eles em sequência invertida, então devo começar em N e não em zero
    *
    *
    * */
    public static int[] reverse(int n){
        int ind = 0;
        int[] resultado = new int[n];
        for (int i = n; i > 0 ; i--) {
            resultado[ind] = i;
            ind++;
        }
        /*OU
        *
        *  public static int[] reverse(int n){
        *    int[] resultado = new int[n];
        *   for (int i = n; i > 0; i--) {
        *        resultado[n-i] = i;
        *        } return resultado;
        *   }
        *
        * */
        return resultado;
    }
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrada: ");
        int n = sc.nextInt();
        System.out.println(Arrays.toString(reverse(n)));
    }

}

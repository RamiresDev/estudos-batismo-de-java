package DesafiosCodeWars;

import java.util.Scanner;

public class DesafioRepearStr {
    public static String repeatStr(final int repeat, final String string) {
        // Objetivo: Escreva uma função que aceite um inteiro não negativo *n* e uma string scomo parâmetros e retorne uma string de vezes *s* exatas repetidas *n*.

        //Processamento: repetir a String pelo valor inteiro de entrada; Ex: int: 3 e string: "a" saída = "aaa"

        /*
         *  Minha maneira de conseguir o resultado foi:
         * String saida = "";
         * for (int i = 0; i < repeat; i++) {
         * saida += string;
         * }
        *  return saida;
        *
        * */

        // Maneira melhor e otimizada, o parâmetro repeat aloca o espaço final de uma vez, evitando o loop que fiz e a criação de vários espaços de memória
        return string.repeat(repeat);
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        //Entrada: Inteiro não negativo e uma String
        System.out.println("Insira a quantidade de repetição: ");
        int qtde = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Agora insira a String: ");
        String valor = scanner.nextLine();

        // Saída: A String repetida pela quantidade de vezes pedida
        System.out.println(repeatStr(qtde, valor));
    }

}

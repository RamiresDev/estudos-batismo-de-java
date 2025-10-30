package DesafiosCodeWars;

import java.util.Scanner;

public class DesafioSummation {
    public static int summation(int n) {
        // Processamento = somar o número 1 aos demais números até n
        // Iniciei um acumulador em 0
        int soma = 0;
        // Loop para passar por todos os números
        for (int i = 1; i <= n; i++) {
            // inseri dentro da variável soma, o valor dela + o número da posição de iteração
            soma += i;
            // Incrementei 1 para o acumulador
            /*o incremento se faz necessário nesse código para que eu possa acumular sempre*/
            /*soma++;*/
        }
        /* Outra maneira de resolver
        *
        * int soma = n * (n + 1) / 2;
        *
        * */
        return soma;
    }

    static void main() {
        // Entrada = um número máximo
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        // Saída = Resultado (todos os números que foram somados)
        int resultado = summation(num);
        System.out.println(resultado);
    }
}

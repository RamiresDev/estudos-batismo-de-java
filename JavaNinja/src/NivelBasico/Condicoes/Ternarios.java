package Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
        * Ternarios: São maneiras de reduzir a quantidade de linhas do código
        * variavel = (condição) ? valorSeVerdadeiro : valorSeFalso;
        *
        * */

        short numeroDeMissoes = 5;
        String nivel = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missões." : "Esse ninja tem menos de 10 missões.";
        System.out.println(nivel);





    }
}

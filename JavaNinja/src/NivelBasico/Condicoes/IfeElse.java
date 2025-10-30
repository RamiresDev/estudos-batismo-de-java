package Condicoes;

public class IfeElse {
    public static void main(String[] args) {

        /*
        * If e Else - Condições
        * Else IF
        *
        * Objetivo: Passar o ninja de nível de acordo com o número de missões.
        *
        *
        * */


        // Ninja Naruto
        String nome = "Naruto Uzumaki";
        String rank;
        int idade = 10;
        boolean hokage = false;
        short numerosDeMissoes = 24;



        //se (condição) {faça isso}

        if (numerosDeMissoes >= 10 && idade > 15 ){
            System.out.println("Rank: Chunnin");
        } else if (numerosDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        }
        else {
            System.out.println("Rank: Gennin");
        }
    }
}

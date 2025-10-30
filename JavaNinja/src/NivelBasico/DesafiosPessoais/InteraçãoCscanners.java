package NivelBasico.DesafiosPessoais;

import java.util.Scanner;

public class InteraçãoCscanners {
    public static void main(String[] args) {
        /*
        * Objetivo: Minha ideia é utilizar minha conclusão do primeiro desafio e implementar a interação do usuário,
        * assim a missão de cada ninja será baseada na idade que o usuário informar. Fazer isto com 3 nomes.
        *
        * */

        //Abrir scanner
        Scanner txtCapture = new Scanner(System.in);

        //Defini as missões e o char correspondente de cada uma.
        String MissaoCaptura = "Capturar animal ninja fugitivo.";
        char rankD = 'D';
        String MissaoResgate = "Resgatar aldeião capturado.";
        char rankC = 'C';
        String MissaoInfiltrar = "Infiltrar-se em aldeia inimiga.";
        char rankB = 'B';
        String MissaoMassacre = "Aniquilar ninjas inimigos na fronteira.";
        char rankA = 'A';
        String MissaoDefenderVila = "Lutar contra a Akatsuki para defender a vila.";
        char rankS = 'S';
        //Inseri as patentes ninjas dentro das Strings
        String genin = "GENIN";
        String chuunin = "CHUUNIN";
        String jounin = "JOUNIN";
        String anbu = "ANBU";
        String kage = "KAGE";

        //Iniciei a interação com o usuário
        System.out.println("Bem vindo ao SISTEMA DE MISSÕES NINJA, aqui distribuíremos as missões de cada ninja, com base em seu nível de ranqueamento.");
        System.out.print("Insira o nome do Ninja: ");
        //Recebi o nome do ninja
        String nomeDoNinja = txtCapture.next();
        //Mostrei ao usuário que recebi a informação que ele passou
        System.out.println("Entendi. O nome do ninja que fará a missão é: " + nomeDoNinja);
        //Disse ao usuário quais opções ele teria para avançar
        System.out.print("TEMOS AS SEGUINTES PATENTES: \n 1 - GENIN \n 2 - CHUUNIN \n 3 - JOUNIN \n 4 - ANBU \n 5 - KAGE \n (Somente números de 1 a 5 serão aceitos como resposta.) \n Qual é a Patente deste ninja: ");
        //recebi um número que corresponde a patente do Ninja
        int patenteDoNinja = txtCapture.nextInt();
        //
        if (patenteDoNinja == 1 ){
            System.out.println("Certo. a Patente deste ninja é " + genin);
            System.out.println( "\n A MISSÃO DESTE NINJA SERÁ: " + MissaoCaptura + " \n RANK DA MISSÃO: " + rankD);
        } else if (patenteDoNinja == 2 ){
            System.out.println("Certo. a Patente deste ninja é " + chuunin);
            System.out.println( "\n A MISSÃO DESTE NINJA SERÁ: " + MissaoResgate + " \n RANK DA MISSÃO: " + rankC);
        } else if (patenteDoNinja == 3){
            System.out.println("Certo. a Patente deste ninja é " + jounin);
            System.out.println( "\n A MISSÃO DESTE NINJA SERÁ: " + MissaoInfiltrar + "\n RANK DA MISSÃO: " + rankB);
        } else if (patenteDoNinja == 4 ) {
            System.out.println("Certo. a Patente deste ninja é " + anbu);
            System.out.println( "\n A MISSÃO DESTE NINJA SERÁ: " + MissaoMassacre + "\n RANK DA MISSÃO: " + rankA);
        } else if (patenteDoNinja == 5 ) {
            System.out.println("Certo. a Patente deste ninja é " + kage);
            System.out.println( "\n A MISSÃO DESTE NINJA SERÁ: " + MissaoDefenderVila + "\n RANK DA MISSÃO: " + rankS);
        } else {
            System.out.println("Você não preencheu corretamente, responda com um número de 1 a 5");
        } txtCapture.close();
    }
}


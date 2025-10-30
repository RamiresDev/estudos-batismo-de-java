package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        /*
        * SwitchCases: Servem para gerar casos especifícos.
        *
        * Objetivo: Pedir para o usuário escolher entre os ninjas switchCase
        *
        * */

        // Pedir para o usuário
        Scanner caixaDeTxt = new Scanner(System.in);

        System.out.println("Escolha um personagem: ");
        System.out.println("3 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("1 - Sakura Haruno");

        // Pedir para o usuário escolher uma das opções
        int escolhaDoUsuario = caixaDeTxt.nextInt();

        System.out.println("Você digitou o número: " + escolhaDoUsuario);

        // Reaçao ao escolher um personagem

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuário escolheu o Naruto Uzumaki, o próximo Hokage.");
                break;
            case 2:
                System.out.println("O usuário escolheu o Sasuke Uchiha, o ninja mais revoltado.");
                break;
            case 3:
                System.out.println("O usuário escolheu a Sakura Haruno, uma excelente Kunoichi.");
                break;
            default:
                System.out.println("Você não digitou uma resposta válida, tente novamente.");
        }

        //Fechar Scanner
        caixaDeTxt.close();
    }
}

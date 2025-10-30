package Condicoes;
import java.util.Scanner;

public class scannerDoUsuario {
    public static void main(String[] args) {

        /*
        * Scanner = Jeito de trazer o usuário para dentro da aplicação.
        *
        * Objetivo: O usuário irá criar o ninja e iremos validar os dados.
        *
        * */


        //Abrir o Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        //Receber o nome do ninja
        System.out.print("Escreva o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        // Receber a idade do ninja
        System.out.print("Escreva a idade do ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNinja + " anos");


        //Tratamento de dados
        if (idadeDoNinja >= 18){
            System.out.println("Esse ninja já é maior de idade e pode ir para missões fora da aldeia.");
        } else {
            System.out.println("Esse ninja é muito novo para sair da vila.");
        }

        // Sempre fechar o Scanner
        caixaDeTexto.close();


    }
}

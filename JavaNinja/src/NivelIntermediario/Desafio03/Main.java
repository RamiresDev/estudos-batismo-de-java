package NivelIntermediario.Desafio03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        /* Desafio concluído sem mais dificuldade

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 17;
        Sasuke.missao = "Infiltrar-se em Aldeia inimiga";
        Sasuke.nivelDificuldade = "Rank A";
        Sasuke.statusMissao = "Concluído";
        Sasuke.mostrarInformacoes();*/

        //Aumentando a dificuldade com interação de usuário
        /*Como desafio adicional, implemente um menu interativo utilizando a classe Scanner para
        *permitir ao usuário escolher entre diferentes opções, como exibir informações de todos os
        *ninjas, adicionar novos ninjas ou atualizar as habilidades especiais. Isso ajudará a praticar o
        *uso de entrada do usuário e controle de fluxo no programa.
        * */

        Scanner entrada = new Scanner(System.in);

        boolean sistemaOn = true;
        ArrayList<Ninja> listaNinjas = new ArrayList<>();



        System.out.println("Bem vindo ao sistema de Cadastro Ninjas !");
        while (sistemaOn){
            System.out.println("\nMe informe o que deseja fazer: ");
            System.out.println("===== Menu Ninja =====");
            System.out.println("1. Adicionar novo ninja");
            System.out.println("2. Exibir informações ninja");
            System.out.println("3. Atualizar habilidade especial");
            System.out.println("4. Desligar sistema");
            System.out.print("Escolha uma opção: ");
            int resposta = entrada.nextInt();
            entrada.nextLine();
            switch (resposta){
                case 1:
                    System.out.print("\n1. Uchiha\n2. Outro\nQual o clã do Ninja: ");
                    int cla = entrada.nextInt();
                    entrada.nextLine();
                    switch (cla){
                        case 1:
                            Uchiha uchiha = new Uchiha();
                            uchiha.adicionarNinja();
                            listaNinjas.add(uchiha);
                            break;
                        case 2:
                            Ninja ninja = new Ninja();
                            ninja.adicionarNinja();
                            listaNinjas.add(ninja);
                            break;
                    }break;
                case 2:
                    if(listaNinjas.isEmpty()){
                        System.out.println("\nNão há ninjas cadastrados!");
                        break;
                    } else {
                        System.out.println("Ninja específico(responda 1) ou todos(responda 2) ?");
                        int rspLista = entrada.nextInt();
                        switch (rspLista){
                            case 1:
                                int indice = 1;
                                System.out.println("LISTA DE NINJAS");
                                for (Ninja n : listaNinjas){
                                    System.out.println(indice+". "+ n.nome);
                                    indice++;
                                }
                                System.out.println("Qual o ìndice do Ninja para exibir informações: ");
                                int escolhaDoNinja = entrada.nextInt();
                                entrada.nextLine();
                                Ninja ninjaEscolhido = listaNinjas.get(escolhaDoNinja-1);
                                ninjaEscolhido.mostrarInformacoes();
                                break;
                            case 2:
                                for (Ninja n : listaNinjas ){
                                    n.mostrarInformacoes();
                                } break;
                        }
                    }
                    break;
                case 3:
                    if(listaNinjas.isEmpty()){
                        System.out.println("\nNão há ninjas cadastrados!");
                        break;
                    } else {
                        System.out.println("Ninja específico(responda 1) ou todos(responda 2) ?");
                        int rspLista = entrada.nextInt();
                        switch (rspLista){
                            case 1:
                                int indice = 1;
                                System.out.println("LISTA DE NINJAS");
                                for (Ninja n : listaNinjas){
                                    System.out.println(indice+". "+ n.nome);
                                    indice++;
                                }
                                System.out.println("Qual o ìndice do Ninja alterar habilidade: ");
                                int escolhaDoNinja = entrada.nextInt();
                                entrada.nextLine();
                                Ninja ninjaEscolhido = listaNinjas.get(escolhaDoNinja-1);
                                System.out.println("Insira a nova habilidade especial: ");
                                ninjaEscolhido.habilidadeEspecial = entrada.nextLine();
                                System.out.println("Certo, a nova habilidade deste ninja é: " + ninjaEscolhido.habilidadeEspecial);
                                break;
                            case 2:
                                System.out.println("Insira a nova habilidade especial de todos: ");
                                String novaHabilidade = entrada.nextLine();
                                for (Ninja n : listaNinjas ){
                                    n.habilidadeEspecial = novaHabilidade;
                                } System.out.println("A habilidade especial de todos os ninjas agora é: " + novaHabilidade);
                                break;
                        }
                    } break;
                case 4:
                    System.out.println("Desligando sistema...");
                    sistemaOn = false;
                    break;
                default:
                    System.out.println("\nNúmero não corresponde a nenhuma ação.");
                    break;
            }
        }
    }
}

package NivelBasico.DesafiosPessoais;

import java.util.Scanner;

public class CadastroDeNinjas {
    public static void main(String[] args) {
        /*
        * Objetivo: Criar um sistema simples para cadastrar novos ninjas e listar todos os ninjas cadastrados.
        * */

        //Abrir scanner
        Scanner scanner = new Scanner(System.in);
        // Variável de número máximo de Ninjas
        int NumeroMaximo = 10;
        // Array que receberá os ninjas
        String[] ninjas = new String[NumeroMaximo];

        // booleano de ativação de sistema
        boolean sistemaON = true;

        // Variável para armazenar os ninjas dentro
        int indicador = 0;

        // Loop para a aplicação ficar funcional, vai se repetir até usuário pedir para sair
        while (sistemaON) {
            // Menu exibido para o usuário
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            // Receber entrada do usuário para seguir
            int resposta = scanner.nextInt();

            // Evita o bug de leitura que faz o código dar loop no "Menu Ninja"
            scanner.nextLine();

            // Switch case para os caminhos a seguir
            switch (resposta) {
                case 1:
                    if (indicador < NumeroMaximo) {
                        System.out.print("Insira o nome do ninja: ");
                        String nomeDoNinja = scanner.nextLine();
                        // Armazenar nome individual na variável indicador
                        ninjas[indicador] = nomeDoNinja;
                        // Aumentar uma casa no indicador
                        indicador++;
                        System.out.println("Ninja cadastrado com sucesso.");
                    } else {
                        System.out.println("A lista de ninjas está cheia. Não é possível receber novos cadastros !");
                    }
                    break;
                case 2:
                    System.out.println("---------------");
                    System.out.println("Lista de ninjas");
                    if (indicador == 0) {
                        System.out.println("---------------");
                        System.out.println("AINDA NÃO HÁ NINJAS CADASTRADOS !");
                        System.out.print("---------------");
                    } else {
                        for (int i = 0; i < indicador; i++) {
                            // Para exibir indice na tela
                            int indice = i + 1;
                            // Para exibir os ninjas que estão na posição da iteração (variável i)
                            System.out.println(indice + ". " + ninjas[i]);
                            System.out.println("---------------");
                            }
                        } break;
                case 3:
                    System.out.println(" --------------------");
                    System.out.println("Você encerrou o programa.");
                    System.out.println(" --------------------");
                    sistemaON = false;
                    break;
                default:
                    System.out.println("---------------");
                    System.out.print("Opção inválida, escolha um dos valores válidos.");
                    break;
            }
        }
    }
}

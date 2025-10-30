package NivelBasico.Desafio02;

import java.util.Scanner;

public class CadastroDeNinjas {
    public static void main(String[] args) {
        //Abertura do Scanner
        Scanner scanner = new Scanner(System.in);
        // Array de armazenamento de Ninjas
        int NumeroMaximo = 1;
        String[] nomeDosNinjas = new String[NumeroMaximo];
        // Valor booleano para causar repetição se for TRUE
        boolean sistemaON = true;
        //Varíavel usada para armazenar os nomes com base nela usamos a de iteração para armazenar próximos
        int indicador = 0;
        // Loop para exibir menu sempre que finalizar uma ação e enquanto 'repetir' for TRUE
        while (sistemaON) {
            //Menu de início da aplicação
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            //Receber a informação de Menu
            String resposta = scanner.nextLine();
            // Interação com switch case
            switch (resposta) {
                case "1":
                    System.out.println("--------------------------");
                    System.out.print("Insira o nome de seu ninja: ");
                    //Criar String para nome individual
                    String nomeDoNinja = scanner.nextLine();
                    //Armazenar nome na String da posição indicada
                    nomeDosNinjas[indicador] = nomeDoNinja;
                    //Após armazenar o valor, da iteração para armazenar o próximo valor
                    indicador++;
                    break;
                case "2":
                    System.out.println("---------------");
                    System.out.println("Lista de ninjas");
                    // Caso o index 0 esteja vazio não há possibilidade de ninjas cadastrados
                    if (nomeDosNinjas[0] == null) {
                        System.out.println("---------------");
                        System.out.println("AINDA NÃO HÁ NINJAS CADASTRADOS !");
                        System.out.print("---------------");
                    } else {
                    // Loop para exibir o nome de todos os ninjas cadastrados
                        for (int i = 0; i < indicador; i++) {
                        // Varíavel para armazenar o índice e exibir antes do nome a posição que ele ocupa
                        int indice = i + 1;
                        // índice e nome do ninja (poderia exibir apenas o nome do ninja)
                        System.out.print(indice + ". " + nomeDosNinjas[i] + "\n");
                        }
                    }
                    break;
                case "3":
                    System.out.println(" --------------------");
                    System.out.println("Você encerrou o programa.");
                    System.out.println(" --------------------");
                    sistemaON = false;
                    break;
                default:
                    //Mensagem a ser exibida na tela caso digitar um valor diferente de 1, 2 ou 3, junto ao loop while que reexibe a mensagem de menu
                    System.out.println("---------------");
                    System.out.print("Opção inválida, escolha um dos valores válidos.");
                    break;
            }
        } scanner.close();
    }
}

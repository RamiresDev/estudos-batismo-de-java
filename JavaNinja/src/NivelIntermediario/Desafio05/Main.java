package NivelIntermediario.Desafio05;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int opcao;

        ContaCorrente novaCC = new ContaCorrente(0);
        ContaPoupanca novaCP = new ContaPoupanca(0);

        System.out.println("Olá, bem vindo ao banco de Konoha: ");
        System.out.println("Me informe o que deseja: \n");

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Depositar na Conta Corrente");
            System.out.println("2 - Depositar na Conta Poupança");
            System.out.println("3 - Consultar saldos");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Insira o valor a ser depositado: ");
                    novaCC.depositar(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Insira o valor a ser depositado: ");
                    novaCP.depositar(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Saldo conta corrente: R$"+novaCC.consultarSaldo());
                    System.out.println("Saldo conta poupança: R$"+novaCP.consultarSaldo());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Insira um número válido.");
                    break;
            }
        } while (opcao !=0);

        sc.close();
    }
}

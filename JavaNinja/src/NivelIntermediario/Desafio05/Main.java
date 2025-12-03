package NivelIntermediario.Desafio05;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int opcao;

        ContaCorrente novaCC = new ContaCorrente(0);
        ContaPoupanca novaCP = new ContaPoupanca(0);
        BancoKonoha trade = new BancoKonoha();
        Conta[] contas =  new Conta[5];
        contas[0] =  novaCC;
        contas[1] = novaCP;
        System.out.println("Olá, bem vindo ao banco de Konoha: ");
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Depositar na Conta Corrente");
            System.out.println("2 - Depositar na Conta Poupança");
            System.out.println("3 - Consultar saldos");
            System.out.println("4 - Tranferir");
            System.out.println("5 - Transferir via índice");
            System.out.println("0 - Sair");
            System.out.println("Me informe o que deseja: \n");
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
                case 4:
                    System.out.println("Informe o valor a ser transferido: ");
                    double valorTransferido = sc.nextInt();
                    System.out.println("Informe a conta de origem:\n1 - POUPANÇA\n2 - CORRENTE\n0 - SAIR ");
                    opcao = sc.nextInt();
                    switch (opcao){
                        case 1:
                            trade.transferir(novaCP, novaCC, valorTransferido);
                            break;
                        case 2:
                            trade.transferir(novaCC, novaCP, valorTransferido);
                            break;
                        case 0:
                            System.out.println("Saindo...");
                            break;
                        default:
                            System.out.println("Insira uma opção válida.");
                            break;
                    } break;
                case 5:
                    System.out.println("Insira o índice da conta de origem: ");
                    int indexOrigem = sc.nextInt();
                        if (indexOrigem >= contas.length){
                            System.out.println("Não há conta no espaço indicado !");
                        } else if (indexOrigem < 0){
                            System.out.println("Valor nulo ou negativo !");
                        } else {
                            System.out.println("Insira o índice de destino: ");
                            int indexDestino = sc.nextInt();
                            if (indexDestino >= contas.length) {
                                System.out.println("Não há conta no espaço indicado !");
                            } else if (indexDestino < 0) {
                                System.out.println("Valor nulo ou negativo !");
                            } else if (indexOrigem == indexDestino) {
                                System.out.println("Não é possível transferência para a mesma conta");
                            } else {
                                System.out.println("Qual valor será transferido ? ");
                                valorTransferido = sc.nextInt();
                                trade.transferir(contas, indexOrigem, indexDestino, valorTransferido);
                                break;
                            }
                        } break;
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

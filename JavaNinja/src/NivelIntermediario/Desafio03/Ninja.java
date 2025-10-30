package NivelIntermediario.Desafio03;

import java.util.Scanner;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;
    String habilidadeEspecial = "Não descoberta";
    Scanner InfoNinja = new Scanner(System.in);
    int rankDoNinja = 0;

    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome +"\nIdade: " + idade + "\nMissão: " + missao + "\nRank da Missão: " + nivelDificuldade + "\nStatus da Missão: " + statusMissao);
    }

    public void adicionarNinja(){
                System.out.println("Insira o nome: ");
                nome = InfoNinja.nextLine();
                System.out.println("Insira a idade: ");
                idade = InfoNinja.nextInt();
                InfoNinja.nextLine();
                System.out.println("1. GENIN\n2. CHUUNIN\n3. JOUNIN\n4. HOKAGE\nInsira o Rank do ninja: ");
                rankDoNinja = InfoNinja.nextInt();
                InfoNinja.nextLine();
                switch (rankDoNinja) {
                    case 1:
                        missao = "Proteger cidadão de bandidos";
                        nivelDificuldade = "RANK C";
                        if (idade > 10){
                            statusMissao = "Concluída";
                        } else {
                            statusMissao = "Não feita/A fazer";
                        } break;
                    case 2:
                        missao = "Proteger o Senhor Feudal";
                        nivelDificuldade = "RANK B";
                        if (idade > 20){
                            statusMissao = "Concluída";
                        } else {
                            statusMissao = "Não feita/A fazer";
                        } break;
                    case 3:
                        missao = "Escoltar Hokage até reunião dos Kages";
                        nivelDificuldade = "RANK A";
                        if (idade > 30){
                            statusMissao = "Concluída";
                        } else {
                            statusMissao = "Não feita/A fazer";
                        } break;
                    case 4:
                        missao = "Proteger aldeia da AKATSUKI";
                        nivelDificuldade = "RANK S";
                        if (idade > 35){
                            statusMissao = "Concluída";
                        } else {
                            statusMissao = "Não feita/A fazer";
                        } break;
                    default:
                        System.out.println("\nNÚMERO NÃO CORRESPONDENTE.");
                        break;
                }
    }
}

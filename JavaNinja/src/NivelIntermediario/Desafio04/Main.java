package NivelIntermediario.Desafio04;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("Qual tipo de ninja criaremos ?\n1 - Básico\n2 - Avançado");
        int tipoNinja = sc.nextInt();
        sc.nextLine();


        Ninja ninja = null;


        switch (tipoNinja) {
            case 1:
                NinjaBasico novoNB = new NinjaBasico();
                System.out.println("Nome: ");
                novoNB.nome = sc.nextLine();
                System.out.println("Idade: ");
                novoNB.idade = sc.nextInt();
                sc.nextLine();
                System.out.println("Aldeia: ");
                novoNB.aldeia = sc.nextLine();
                System.out.println("Habilidade: ");
                novoNB.habilidade = sc.nextLine();
                ninja = novoNB;
                break;
            case 2:
                NinjaAvancado novoNA = new NinjaAvancado();
                System.out.println("Nome: ");
                novoNA.nome = sc.nextLine();
                System.out.println("Idade: ");
                novoNA.idade = sc.nextInt();
                sc.nextLine();
                System.out.println("Aldeia: ");
                novoNA.aldeia = sc.nextLine();
                System.out.println("Habilidade: ");
                novoNA.habilidade = sc.nextLine();
                System.out.println("Especialidade: ");
                novoNA.especialidade = sc.nextLine();
                ninja = novoNA;
                break;
            default:
                System.out.println("Número não aceito !");
                break;
        }

        NinjaAvancado naruto = new NinjaAvancado("Naruto Uzumaki", 15, "Konoha", "Rasengan", "Fuuton");
        NinjaBasico konohamaru = new NinjaBasico("Konohamaru Sarutobi", 8,"Konoha", "Jutsu Sexy");
        System.out.println("\n--- Resultado ---");
        if (ninja == null){
            System.out.println("Nenhum ninja criado !");
        } else {
            konohamaru.mostrarInformacoes();
            konohamaru.executarHabilidade();
            naruto.mostrarInformacoes();
            naruto.executarHabilidade();
            ninja.mostrarInformacoes();
            ninja.executarHabilidade();
        }
    }
}

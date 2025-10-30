package NivelBasico.Desafio01;

public class programNinja {
    public static void main(String[] args) {
        /*
         * Objetivo: Criar um programa que represente 3 ninjas de Konoha e suas respectivas missôes.
         * Cada ninja terá nome, idade e uma missão, com o nome da missão, nível de dificuldade e status de conclusão.
         * */
        String missao1 = "Procurar mascara de gato dentro da vila.";
        char nvlMissao1 = 'A';
        String missao2 = "Resgatar aldeão sequestrado por somente 1 ninja inimigo.";
        char nvlMissao2 = 'C';
        String missao3 = "Infiltrar-se em aldeia rival para colher informações.";
        char nvlMissao3 = 'S';

        String feita = "Concluída.";
        String Nfeita = "Não concluída.";

        String ninja1 = "Minato";
        System.out.println("O primeiro ninja se chama: " + ninja1);
        int ninja1age = 42;
        System.out.println("Sua idade é de: " + ninja1age + " anos");
        boolean apto = false;

        if (ninja1age > 16 && ninja1age < 40) {
            apto = true;
        } else if (ninja1age == 16) {
            System.out.println("Missão: " + missao2);
            System.out.println("Missão de RANK: " + nvlMissao2);
            System.out.println("Status da missão: " + Nfeita);
        } else if (ninja1age < 16 && ninja1age > 7) {
            System.out.println("Missão: " + missao1);
            System.out.println("Missão de RANK: " + nvlMissao1);
            System.out.println("Status da missão: " + feita);
        } else if (ninja1age == 7) {
            System.out.println("Missão: " + missao1);
            System.out.println("Missão de RANK: " + nvlMissao1);
            System.out.println("Status da missão: " + Nfeita);
        } else if (ninja1age == 40) {
            System.out.println("Missão: " + missao3);
            System.out.println("Missão de RANK: " + nvlMissao3);
            System.out.println("Status da missão: " + Nfeita);
        } else if (ninja1age > 40) {
            System.out.println("Missão: " + missao3);
            System.out.println("Missão de RANK: " + nvlMissao3);
            System.out.println("Status da missão: " + feita);
        } else if (ninja1age <= 6) {
            System.out.println("Não é formado na Academia Ninja !!!");
        }
        if (apto == true) {
            System.out.println("Missão: " + missao2);
            System.out.println("Missãode RANK: " + nvlMissao2);
            System.out.println("Status da missão: " + feita);
        }

        System.out.println();

        String ninja2 = "Naruto";
        System.out.println("O segundo ninja se chama: " + ninja2);
        int ninja2age = 16;
        System.out.println("Sua idade é de: " + ninja2age + " anos");

        if (ninja2age > 16 && ninja2age < 40) {
            apto = true;
        } else if (ninja2age == 16) {
            System.out.println("Missão: " + missao2);
            System.out.println("Missão de RANK: " + nvlMissao2);
            System.out.println("Status da missão: " + Nfeita);
        } else if (ninja2age < 16 && ninja2age > 7) {
            System.out.println("Missão: " + missao1);
            System.out.println("Missão de RANK: " + nvlMissao1);
            System.out.println("Status da missão: " + feita);
        } else if (ninja2age == 7) {
            System.out.println("Missão: " + missao1);
            System.out.println("Missão de RANK: " + nvlMissao1);
            System.out.println("Status da missão: " + Nfeita);
        } else if (ninja2age == 40) {
            System.out.println("Missão: " + missao3);
            System.out.println("Missão de RANK: " + nvlMissao3);
            System.out.println("Status da missão: " + Nfeita);
        } else if (ninja2age > 40) {
            System.out.println("Missão: " + missao3);
            System.out.println("Missão de RANK: " + nvlMissao3);
            System.out.println("Status da missão: " + feita);
        } else if (ninja2age <= 6) {
            System.out.println("Não é formado na Academia Ninja !!!");
        }
        if (apto == true) {
            System.out.println("Missão: " + missao2);
            System.out.println("Missãode RANK: " + nvlMissao2);
            System.out.println("Status da missão: " + feita);
        }

        System.out.println();

        String ninja3 = "Konohamaru";
        System.out.println("O terceiro ninja se chama: " + ninja3);
        int ninja3age = 8;
        System.out.println("Sua idade é de: " + ninja3age + " anos");

        if (ninja3age > 16 && ninja3age < 40) {
            apto = true;
        } else if (ninja3age == 16) {
            System.out.println("Missão: " + missao2);
            System.out.println("Missão de RANK: " + nvlMissao2);
            System.out.println("Status da missão: " + Nfeita);
        } else if (ninja3age < 16 && ninja3age > 7) {
            System.out.println("Missão: " + missao1);
            System.out.println("Missão de RANK: " + nvlMissao1);
            System.out.println("Status da missão: " + feita);
        } else if (ninja3age == 7) {
            System.out.println("Missão: " + missao1);
            System.out.println("Missão de RANK: " + nvlMissao1);
            System.out.println("Status da missão: " + Nfeita);
        } else if (ninja3age == 40) {
            System.out.println("Missão: " + missao3);
            System.out.println("Missão de RANK: " + nvlMissao3);
            System.out.println("Status da missão: " + Nfeita);
        } else if (ninja3age > 40) {
            System.out.println("Missão: " + missao3);
            System.out.println("Missão de RANK: " + nvlMissao3);
            System.out.println("Status da missão: " + feita);
        } else if (ninja3age <= 6) {
            System.out.println("Não é formado na Academia Ninja !!!");
        }
        if (apto == true) {
            System.out.println("Missão: " + missao2);
            System.out.println("Missãode RANK: " + nvlMissao2);
            System.out.println("Status da missão: " + feita);
        }
    }
}

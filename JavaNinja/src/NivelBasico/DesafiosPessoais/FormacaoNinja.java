package NivelBasico.DesafiosPessoais;

import java.util.Scanner;

public class FormacaoNinja {
    public static void main(String[] args) {
        /*
         * Objetivo: Pretendo criar uma aplicação simples que simule uma avaliação de Jutsu Ninja, utilizando todos os conceitos que vi até aqui.
         * Devo utilizar Scanner, If e Else e/ou SwitchCases, While e/ou For
         *
         * Idéia inicial: Aprovar qualquer aluno que após aplicar determinado Justu permaneça com mais de 70% do Chakra.
         *
         * Informações serão inseridas pelo usuário, com o detalhe que o ninja só conseguirá atingir determinado Jutsu com base na sua idade.
         *
         * */

        //Jutsus
        String RankE = "Técnica de Substituição";
        String RankD = "Furacão da Folha";
        String RankC = "Técnica de Invocação";
        String RankB = "Clones das Sombras";
        String RankA = "Chidori";
        String RankS = "Rasenshuriken";

        //Gasto de Chakra por JUTSU com base em RANK
        int rankEchakra = 10;
        int rankDchakra = 30;
        int rankCchakra = 32;
        int rankBchakra = 36;
        int rankAchakra = 40;
        int rankSchakra = 100;
        // Chakra do usuario começa em 10 até sabermos qual o seu rank
        int chakraDoUsuario = 10;

        //Abrir Scanner
        Scanner scanner = new Scanner(System.in);

        //Interação de entrada
        System.out.print("Olá ninja, apresente-se com seu nome: ");
        String nomeDoNinja = scanner.nextLine();
        System.out.println("Certo, seu nome é " + nomeDoNinja);

        //Colher informações de idade
        System.out.print("Agora me informe sua idade: ");
        int idadeDoNinja = scanner.nextInt();
        //CONDIÇÃO DE IDADE MÍNIMA
        if (idadeDoNinja < 3) {
            System.out.println("Ok " + nomeDoNinja + " você tem " + idadeDoNinja + " anos. Idade insuficiente para ser considerado um ninja.");
        } else if (idadeDoNinja >= 4) {
            System.out.println("Ok " + nomeDoNinja + " você tem " + idadeDoNinja + " anos.");
        }
        //Se a idade for menor ou igual a 6, informa a mensagem e o código acaba
        if (idadeDoNinja <= 6) {
            System.out.println("Você não tem idade o suficiente para ter saído da academia, portanto não pode participar desta avaliação !!!");
        } //Caso seja maior que 6, temos alguns caminhos
        else {
            // Informação sobre nível de RANK Ninja
            System.out.print(nomeDoNinja + " existem os seguintes RANKS NINJA: \n 1 - GENIN \n 2 - CHUUNIN \n 3 - JOUNIN \n 4 - ANBU \n 5 - HOKAGE \n INSIRA O SEU RANK: ");
            int rankDoNinja = scanner.nextInt();
            // Laço de repetição para informar um número válido que corresponda a algum dos RANKS
            while (rankDoNinja > 5 || rankDoNinja < 1) {
                System.out.print(nomeDoNinja + " existem os seguintes RANKS NINJA: \n 1 - GENIN \n 2 - CHUUNIN \n 3 - JOUNIN \n 4 - ANBU \n 5 - HOKAGE \n INSIRA O SEU RANK: ");
                rankDoNinja = scanner.nextInt();
            } // Switch para emitir na tela o texto informando qual o rank do ninja E DAR UM CHAKRA PARA O USUARIO
            switch (rankDoNinja) {
                case 1:
                    String genin = "GENIN";
                    System.out.println("Você é um de nossos " + genin);
                    chakraDoUsuario = 100;
                    break;
                case 2:
                    String chuunin = "CHUUNIN";
                    System.out.println("Você já é um " + chuunin + ", continue persistindo");
                    chakraDoUsuario = 120;
                    break;
                case 3:
                    String jounin = "JOUNIN";
                    System.out.println("Você é um grande ninja, o nível " + jounin + " não é para qualquer um ");
                    chakraDoUsuario = 150;
                    break;
                case 4:
                    String anbu = "ANBU";
                    System.out.println("Agindo nas sombras pelo bem da vila, então você é um " + anbu);
                    chakraDoUsuario = 150;
                    break;
                case 5:
                    String hokage = "Hokage";
                    System.out.println("Você é o nosso líder e representante, o grande " + hokage);
                    chakraDoUsuario = 500;
                    break;
                default:
                    System.out.println("Selecione uma opção válida !!!");
                    break;
            }
            //Inserir interação que peça para o usuário informar um jutsu
            System.out.println("\n Agora me diga qual desses jutsus você vai utilizar, lembre-se que cada um deles consome uma % de chakra e caso você fique com menos de 70% do seu, você estará desqualificado. ");
            System.out.println("Os níveis de CHAKRA são: \n GENIN = 100 \n CHUUNIN = 120 \n JOUNIN = 150 \n ANBU = 150 \n KAGE = 500 ");
            System.out.println("Escolha uma das técnicas a seguir para demostrar: \n 1 - Técnica de Substituição \n 2 - Furacão da Folha \n 3 - Técnica de Invocação \n 4 - Clones das Sombras \n 5 - Chidori \n 6 - Rasenshuriken \n QUAL TÉCNICA VOCÊ UTILIZARÁ: ");
            //Receber técnica a ser utilizada e fazer loop novamente para informar a correta
            int tecnicaNinja = scanner.nextInt();
            while (tecnicaNinja < 1 || tecnicaNinja > 6) {
                System.out.println("ESCOLHA INEXISTENTE.");
                System.out.println("Escolha uma das técnicas a seguir para demostrar: \n 1 - Técnica de Substituição \n 2 - Furacão da Folha \n 3 - Técnica de Invocação \n 4 - Clones das Sombras \n 5 - Chidori \n 6 - Rasenshuriken \n QUAL TÉCNICA VOCÊ UTILIZARÁ: ");
                tecnicaNinja = scanner.nextInt();
            }
            // Restante de Chakra para dar condições de valores mínimos e porcentagem aceita
            int RestanteChakra = chakraDoUsuario;
            switch (tecnicaNinja) {
                case 1:
                    RestanteChakra = chakraDoUsuario - rankEchakra;
                    if (RestanteChakra > 0 && RestanteChakra < 0.7 * chakraDoUsuario) {
                        System.out.println("Seu chakra restante é de: " + RestanteChakra);
                        System.out.println("Você foi eliminado da competição.");
                    } else {
                        System.out.println("Seu chakra restante é de: " + RestanteChakra);
                    }
                    break;
                case 2:
                    RestanteChakra = chakraDoUsuario - rankDchakra;
                    if (RestanteChakra > 0 && RestanteChakra < 0.7 * chakraDoUsuario) {
                        System.out.println("Seu chakra restante é de: " + RestanteChakra);
                        System.out.println("Você foi eliminado da competição.");
                    } else {
                        System.out.println("Seu chakra restante é de: " + RestanteChakra);
                    }
                    break;
                case 3:
                    RestanteChakra = chakraDoUsuario - rankCchakra;
                    if (RestanteChakra > 0 && RestanteChakra < 0.7 * chakraDoUsuario) {
                        System.out.println("Seu chakra restante é de: " + RestanteChakra);
                        System.out.println("Você foi eliminado da competição.");
                    } else {
                        System.out.println("Seu chakra restante é de: " + RestanteChakra);
                    }
                    break;
                case 4:
                    RestanteChakra = chakraDoUsuario - rankBchakra;
                    if (RestanteChakra > 0 && RestanteChakra < 0.7 * chakraDoUsuario) {
                        System.out.println("Seu chakra restante é de: " + RestanteChakra);
                        System.out.println("Você foi eliminado da competição.");
                    } else {
                        System.out.println("Seu chakra restante é de: " + RestanteChakra);
                    }
                    break;
                case 5:
                    RestanteChakra = chakraDoUsuario - rankAchakra;
                    if (RestanteChakra > 0 && RestanteChakra < 0.7 * chakraDoUsuario) {
                        System.out.println("Seu chakra restante é de: " + RestanteChakra);
                        System.out.println("Você foi eliminado da competição.");
                    } else {
                        System.out.println("Seu chakra restante é de: " + RestanteChakra);
                    }
                    break;
                case 6:
                    RestanteChakra = chakraDoUsuario - rankSchakra;
                    if (RestanteChakra > 0 && RestanteChakra < 0.7 * chakraDoUsuario) {
                        System.out.println("Seu chakra restante é de: " + RestanteChakra);
                        System.out.println("Você foi eliminado da competição.");
                    } else {
                        System.out.println("Seu chakra restante é de: " + RestanteChakra);
                    }
                    break;
            } if (RestanteChakra == 0 ){
                System.out.println("O ninja " + nomeDoNinja + " morreu !!!");
            }
        }
            //Fechar Scanner
            scanner.close();
    }
}

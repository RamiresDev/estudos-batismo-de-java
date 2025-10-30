package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*
        * Laços de repetição: Vão repetir infinitamente até atingir o parâmetro desejado.
        *
        * WHILE e FOR
        *
        * */

        //WHILE
        // while (condição) {Tudo aqui vai acontecer}

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        /*while (numeroDeClones <= numeroMaximoDeClones) {
                if (numeroDeClones == 1) {
                System.out.println("O Naruto fez " + numeroDeClones + " clone das sombras");
                } else if (numeroDeClones >= 2) {
                    System.out.println("O Naruto fez " + numeroDeClones + " clones das sombras " );
                }
                numeroDeClones++;
        }*/

        //FOR

        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            if (numeroDeClones == 1) {
                System.out.println("O Naruto fez " + numeroDeClones + " clone das sombras");
            } else if (numeroDeClones >= 2) {
                System.out.println("O Naruto fez " + numeroDeClones + " clones das sombras " );
            }
            numeroDeClones++;
        }


    }
}

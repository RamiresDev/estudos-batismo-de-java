package DesafiosCodeWars;

public class betterThanAverage {
    /*Quão bom você realmente é ?
    * Houve uma prova na sua turma e você passou. Parabéns!
    Mas você é uma pessoa ambiciosa. Você quer saber se é melhor que a média dos alunos da sua turma.
    Você recebe uma matriz com as notas dos seus colegas nos testes. Agora calcule a média e compare suas notas!
    Volte true se estiver melhor, senão false!
    Observação:
    Os seus pontos não são contabilizados na pontuação da sua turma. Não se esqueça deles ao calcular a nota média!
    * */
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        // Sempre que quiser acumular o valor, a variável deve estar fora do ‘loop’
        int total = 0;
        /* Loop vai percorrer todo o array devido o atributo length*/
        for (int classPoint : classPoints) {
            // o símbolo de += vai somar o próprio valor de total ao valor do array classPoints da posição iterada
            total += classPoint;
        }
        // devido a média poder ser tanto int quanto double, devemos transformar um dos valores em double com a informação (double) antes da variável
        double media = (double) total / classPoints.length;
        // o Retorno será true se ma variável yourPoints for maior que a variável média
        return yourPoints > media;
    }
}


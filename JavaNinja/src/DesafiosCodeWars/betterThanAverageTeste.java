package DesafiosCodeWars;

public class betterThanAverageTeste {
/*Quão bom você realmente é ?
* Houve uma prova na sua turma e você passou. Parabéns!
Mas você é uma pessoa ambiciosa. Você quer saber se é melhor que a média dos alunos da sua turma.
Você recebe uma matriz com as notas dos seus colegas nos testes. Agora calcule a média e compare suas notas!
Volte true se estiver melhor, senão false!
Observação:
Os seus pontos não são contabilizados na pontuação da sua turma. Não se esqueça deles ao calcular a nota média!
* */
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        // Qual a entrada? (o que o programa precisa receber?)
        // O programa deve descobrir a média de notas do array classPoints
        /*
        * Este teste em espécifico começa a partir do processamento, porque a entrada deve ser inserida em outra classe
        * */
        // Qual o processamento? (o que deve ser feito com esses dados)
        // Comparar com o valor da variável yourPoints
        int total = 0;
        for (int i = 0; i < classPoints.length; i++) {
            total += classPoints[i];
        }
        double media = (double) total / classPoints.length;
        // Qual é a saída? (o que o programa deve retornar?)
        // Deve retornar true se a variável for maior que a média do array, ou false se não for
        return yourPoints > media;
    }

    static void main() {
        int[] notasDaTurma = {5, 5, 5, 5, 5, 5, 5};
        int minhaNota = 6;
        switch (betterThanAverage(notasDaTurma, minhaNota)){
            case true:
                System.out.println("Você está acima da média !!!");
                break;
            case false:
                System.out.println("Você não está acima média !");
                break;
        }
    }
}

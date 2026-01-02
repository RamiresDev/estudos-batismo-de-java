package DesafiosCodeWars;

public class SumOfTwoLowestPositiveIntegers {
    public static long sumTwoSmallestNumbers(long[] numbers) {
        long menorNumero = numbers[0];
        long segundoMenorNumero = numbers[1];
        long temp = 0;
        assert numbers.length >= 4;

        if (menorNumero > segundoMenorNumero) {
            temp = menorNumero;
            menorNumero = segundoMenorNumero;
            segundoMenorNumero = temp;
        }

        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] < menorNumero) {
                segundoMenorNumero = menorNumero;
                menorNumero = numbers[i];
            } else if (numbers[i] < segundoMenorNumero) {
                segundoMenorNumero = numbers[i];
            }
        }
        return menorNumero + segundoMenorNumero;
    }
}

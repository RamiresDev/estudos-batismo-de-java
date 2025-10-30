package DesafiosCodeWars;

public class DesafioKeepHydrated {
    public static int liters(double time)  {
        // Entrada: quantidade de horas
        // Processamento: Horas * 0,5
        // Saída: Litros de água (arredondados para baixo)
        return (int) Math.floor(time * 0.5);
    }

    static void main() {
        System.out.println(liters(16));;
    }
}

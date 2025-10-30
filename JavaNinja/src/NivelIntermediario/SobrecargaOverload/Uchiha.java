package NivelIntermediario.SobrecargaOverload;


public class Uchiha extends Ninja {
    @Override
    public void habilidadeEspecial() {
        System.out.println("Esta é a habilidade especial do clã Uchiha.");
    }

    @Override
    public void estrategiaDeBatalhaNinja(){
        System.out.println("Esta é uma estrategia de batalha Uchiha.");
    }


    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public Uchiha() {
    }
}

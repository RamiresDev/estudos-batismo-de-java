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

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é: "+nome+" e essa é minha Inteligência de combate");
    }
    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi == 150) {
            System.out.println("Seu QI é: "+qi+" e você é um gênio");
        } else if (qi >= 130 && qi < 150) {
            System.out.println("Seu QI é: "+qi+" e você é um ninja promissor!");
        } else {
            System.out.println("Seu QI é: "+qi+" e você precisa treinar mais suas estratégias");
        }
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

package NivelIntermediario.ClassesAbstratas_e_Interfaces;

public class Uchiha extends Ninja {
    @Override
    public void nomeNinja() {
            System.out.println("Descendente do clã Uchiha, seu nome é "+nome);
    }

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    @Override
    public void estratregiaDeBatalha() {
        System.out.println("Combate próximo para tentar utilizar Genjutsu");
    }
}

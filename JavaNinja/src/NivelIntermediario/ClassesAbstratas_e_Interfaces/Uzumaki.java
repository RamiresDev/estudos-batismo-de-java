package NivelIntermediario.ClassesAbstratas_e_Interfaces;

public class Uzumaki extends Ninja{
    @Override
    public void nomeNinja() {
        System.out.println("Descendente do extinto clã Uzumaki, seu nome é "+nome);
    }

    @Override
    public void estratregiaDeBatalha() {
        System.out.println("Batalha de longa duração devido o alto nível de chakra");
    }
}

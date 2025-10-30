package NivelIntermediario.ClassesAbstratas_e_Interfaces;

public abstract class Ninja implements EstrategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;

    // Métodos abstratos
    public abstract void nomeNinja();

    // Métodos concretos/comuns
    public void dataMorte(int dia, int mes, int ano){
        if (dia > 31 || mes > 12 || ano < 0){
            System.out.println("Informe uma data de falecimento válida !");
        } else {
        System.out.println(dia+"/"+mes+"/"+ano);
        }
    }

    /* Metodo abstrato é obrigatório em todas as subclasses
    public abstract void estrategiaDeBatalhaNinja(); */


    // Sobreescrevendo o metodo da interface
    @Override
    public void estratregiaDeBatalha() {
        System.out.println("Substituição e jogar kunai");
    }




    public Ninja() {
    }

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }
}

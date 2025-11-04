package NivelIntermediario.SobrecargaOverload;

public class Ninja implements habilidadesNinja {

    // TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas, Rank
    // TODO: Rank: Gennin. Chuunin, Jounin, Kage
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;


    @Override
    public void habilidadeEspecial() {
        System.out.println("Esta é a minha habilidade especial.");
    }

    @Override
    public void estrategiaDeBatalhaNinja(){
        System.out.println("Esta é uma estrategia de batalha Ninja.");
    }

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }
    //TODO: Sobrecarga do construtor com os novos atributos
    // SOBRECARGA DE METODOS NÃO PRECISA REDECLARAR O CONSTRUTOR, APENAS OS NOVOS ATRIBUTOS

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    // Sobrecarga de metodo - inteligencia de combate (metodo padrão)
    public void inteligenciaDeCombate() {
    System.out.println("Meu nome é: "+nome+" e essa é minha Inteligência de combate");
    }

    // Sobrecarga de metodo
    public void inteligenciaDeCombate(int qi) {
        if (qi == 150) {
            System.out.println("Seu QI é: "+qi+" e você é um gênio");
        } else if (qi >= 130 && qi < 150) {
            System.out.println("Seu QI é: "+qi+" e você é um ninja promissor!");
        } else {
            System.out.println("Seu QI é: "+qi+" e você precisa treinar mais suas estratégias");
        }
    }
}

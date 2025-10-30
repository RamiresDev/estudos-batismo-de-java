package NivelIntermediario;

public abstract class Hokages {

    String nome;
    int idade;
    boolean vivoOuNao;

    public abstract void sabedoriaHokage();


    public Hokages(){
        //Construtor vazio = sem argumentos
    }

    // Construtor com argumento
    public Hokages(String nome){
        this.nome = nome;
    }

    public Hokages(int idade){
        this.idade = idade;
    }


    // All args contructor = construtor com todos os argumentos
    public Hokages(String nome, int idade, boolean vivoOuNao){
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

    //Você consegue criar construtores automaticamente com o IntelliJ ( CTRL + N)
    public Hokages(int idade, String nome, boolean vivoOuNao) {
        this.idade = idade;
        this.nome = nome;
        this.vivoOuNao = vivoOuNao;
    }
}

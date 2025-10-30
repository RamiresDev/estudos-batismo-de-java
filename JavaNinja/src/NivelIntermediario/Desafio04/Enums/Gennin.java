package NivelIntermediario.Desafio04.Enums;

public class Gennin implements Ninja{
    String nome;
    int idade;
    String habilidade;
    TipoHabilidade tipoHabilidade;

    public Gennin(String nome, int idade, String habilidade, TipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipoHabilidade = tipoHabilidade;
    }

    public Gennin() {
    }


    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: "+nome+"\nIdade: "+idade+"\nHabilidade: "+habilidade+"\nTipo de Habilidade: "+TipoHabilidade.valueOf(String.valueOf(tipoHabilidade))+"\n");
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Eu sou "+nome+" e esta é minha habilidade: "+habilidade);
    }

}

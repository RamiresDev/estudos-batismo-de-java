package NivelIntermediario.Desafio04.Enums;

public class Chuunin implements Ninja{
    String nome;
    int idade;
    String habilidade;
    String especialidade;
    TipoHabilidade tipoHabilidade;


    public Chuunin(String nome, int idade, String habilidade, String especialidade, TipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
        this.tipoHabilidade = tipoHabilidade;
    }

    public Chuunin() {
    }



    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: "+nome+"\nIdade: "+idade+"\nHabilidade: "+habilidade+"\nEspecialidade: "+especialidade+"\nTipo de Habilidade: "+TipoHabilidade.valueOf(String.valueOf(tipoHabilidade))+"\n");
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Eu sou "+nome+" e esta é minha habilidade: "+habilidade+" do tipo "+TipoHabilidade.valueOf(String.valueOf(tipoHabilidade)));
    }
}

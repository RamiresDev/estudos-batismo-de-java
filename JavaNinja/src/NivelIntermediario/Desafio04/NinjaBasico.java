package NivelIntermediario.Desafio04;


public class NinjaBasico implements Ninja{
    String nome;
    int idade;
    String aldeia;
    String habilidade;


    public NinjaBasico(String nome, int idade, String aldeia, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.habilidade = habilidade;
    }
    public NinjaBasico() {
    }
    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: "+nome+"\nIdade: "+idade+"\nAldeia: "+aldeia+"\nHabilidade: "+habilidade);
    }


    @Override
    public void executarHabilidade(){
        System.out.println("Receba este ataque: " + habilidade);
    }


}
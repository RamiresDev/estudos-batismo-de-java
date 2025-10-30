package NivelIntermediario.Desafio04;

public class NinjaAvancado extends NinjaBasico {


    String especialidade;


    public NinjaAvancado(String nome, int idade, String aldeia, String habilidade, String especialidade) {
        super(nome, idade, aldeia, habilidade);
        this.especialidade = especialidade;
    }


    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Especialidade: " + especialidade);
    }


    public NinjaAvancado() {
    }


    @Override
    public void executarHabilidade(){
        System.out.println("Estilo "+ especialidade + " jutsu " + habilidade);
    }


}
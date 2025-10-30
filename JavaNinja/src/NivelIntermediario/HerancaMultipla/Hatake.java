package NivelIntermediario.HerancaMultipla;

public class Hatake extends Ninja implements SharinganInterface, ninjaDeElite, HokageInterface{

    public void boasVindas(){
        System.out.println("Sou o " + nome + " e sou do clã Hatake.");
    }

    @Override
    public void bemVindoAnbu() {
        System.out.println("Sou " + nome + " ninja de Elite da ANBU !");
    }

    @Override
    public void HokageAtivo() {
        System.out.println(nome + " sou o grande HOKAGE !");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println(nome + " ativou o SHARINGAN, após receber de um UCHIHA");
    }
}

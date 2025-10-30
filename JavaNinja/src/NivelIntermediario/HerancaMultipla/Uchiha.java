package NivelIntermediario.HerancaMultipla;

public class Uchiha extends Ninja implements SharinganInterface {


    // Esse metodo vem direto da interface!
    @Override
    public void sharinganAtivado() {
        System.out.println(nome + " ativou o seu SHARINGAN");
    }
}

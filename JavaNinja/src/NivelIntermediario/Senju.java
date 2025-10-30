package NivelIntermediario;

public class Senju extends Hokages{

    static void main() {
        Senju hashirama = new Senju();
        hashirama.nome = "Hashira Senju";
        hashirama.idade = 45;
        hashirama.vivoOuNao = false;
        hashirama.sabedoriaHokage();
    }

    @Override
    public void sabedoriaHokage() {
        System.out.println("Você ganhou sabedoria !!!");
    }
}

package NivelIntermediario.ReferenciaDeMemoria;

public class Ninja {
    String nome;
    String aldeia;
    int idade;


    // Necessário fazer o Override para utilizar o toString, substituindo a referência de memória
    @Override
    public String toString() {
        return "Meu nome é "+nome+" eu sou da "+aldeia+" e tenho "+idade+" anos.";
    }
}

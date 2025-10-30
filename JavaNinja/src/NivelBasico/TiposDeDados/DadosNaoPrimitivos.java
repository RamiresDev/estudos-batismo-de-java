package NivelBasico.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
        * Dados não primitivos: String, Array, Class, enum
        * Objetivo: Criar um ninja e atribuir métodos a ele.
        * */

        String nome = "Naruto Uzumaki";
        String nomeUppercase = nome.toUpperCase(); //Tudo em CAPSLOCK
        System.out.println("Texto em CAPSLOCK: " + nomeUppercase);
        System.out.println("Texto normal: " + nome);

        String aldeia = "FOLHA";
        String aldeiaLowercase = aldeia.toLowerCase();
        System.out.println(aldeiaLowercase);

    }
}

package NivelIntermediario;

public class Ninja {
    String nome;
    String aldeia;
    int idade;


    public String EuSouUmNinja() {
        /*o metodo String é obrigado a retornar uma String
         * */
        return "Oi, eu sou um ninja! ";
    }


    // POLIMORFISMO: metodo geral: Todos os ninjas vão ter.
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial.");
    }


    public int anosParaSeTornarHokage(int idadeMinimaHokage){
        return idadeMinimaHokage - idade;
    }

}

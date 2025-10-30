package NivelIntermediario;

public class Uchiha extends Ninja {
    // Criar um metodo público personalizado
    /*public void SharinganAtivado() {
        System.out.print("Meu nome é "+ nome +" o sharingan ativou, sou um Uchiha ! \n");
        //O metodo VOID não retorna valor nenhum
    }*/

    // POLIMORFISMO:
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + "e esse é meu ataque Uchiha.");
    }
}

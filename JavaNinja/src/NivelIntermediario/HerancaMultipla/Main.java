package NivelIntermediario.HerancaMultipla;

public class Main {
    static void main(){

        // Obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Konoha";
        sasuke.idade = 18;
        sasuke.sharinganAtivado();


        // Obj Hatake
        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.aldeia = "Konoha";
        kakashi.idade = 38;
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.bemVindoAnbu();

    }
}

package NivelIntermediario.SobrecargaOverload;

public class Main {
    static void main(){

        // Obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Konoha";
        sasuke.idade = 18;
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();


        // Obj Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Konoha";
        naruto.idade = 17;
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();
        naruto.rank = NivelNinja.GENNIN;

        // Obj Uchiha 2
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Konoha", 29);
        itachi.habilidadeEspecial();

    }
}

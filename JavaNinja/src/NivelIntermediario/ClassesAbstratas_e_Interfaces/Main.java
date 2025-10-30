package NivelIntermediario.ClassesAbstratas_e_Interfaces;

public class Main {


    public static void main(String[] args) {
        // Obj Ninja não pode ser criado (devido abstração)


        // Obj Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.nomeNinja();
        naruto.estratregiaDeBatalha();


        // Obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.nomeNinja();
        sasuke.estratregiaDeBatalha();

        // Obj Uchiha 2
        Uchiha itachi = new Uchiha("Itachi Uchiha", 16, "Konoha");
        itachi.nomeNinja();
        itachi.dataMorte(10,10,2000);
    }
}

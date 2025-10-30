package NivelIntermediario;

public class Main {
    static void main(String[] args) {
       /* // Criar o ninja Naruto - Naruto é um objeto
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Konoha";
        Naruto.idade = 17;
        Naruto.ModoSabioAtivado();

        // Criar o ninja Sasuke - Sasuke é um objeto
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Konoha";
        Sasuke.idade = 19;
        // Aplicando meus próprios métodos
        Sasuke.SharinganAtivado();


        //Chamando o metodo, é necessário colocar ele dentro de alguma variável
        *//*‘String’ souNinja = Sasuke.EuSouUmNinja();
        System.out.println(souNinja);

        int quantoTempoFalta = Sasuke.anosParaSeTornarHokage(20);
        System.out.println("Você tem: " + Sasuke.idade + " anos então falta no mínimo " + quantoTempoFalta + " anos para você estar apto a ser Hokage.");*//*


        // Criar Sakura Haruno
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Konoha";
        Sakura.idade = 18;
        Sakura.ativarCura();

        // Objeto 4 (Hinata Hyuga)
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.idade = 16;
        Hinata.aldeia = "Konoha";
        Hinata.Byakugan();


        Boruto boruto = new Boruto();
        boruto.nome = "Boruto";
        boruto.idade = 9;
        boruto.aldeia = "Konoha";
        boruto.ModoSabioAtivado();
        boruto.ativarKarma();
        boruto.AtivarJougan();*/



        // POLIMORFISMO:
       /* Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 17;
        naruto.aldeia = "Konoha";
        naruto.habilidadeEspecial();


        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 17;
        sasuke.aldeia = "Konoha";
        sasuke.habilidadeEspecial();
*/

        Hokages naruto = new Senju();
        naruto.sabedoriaHokage();



       /* // CONSTRUTORES
        Hokages Hashirama = new Hokages();
        Hashirama.nome = "Hashirama Senju";
        Hashirama.idade = 45;
        Hashirama.vivoOuNao = true;

        Hokages Tobirama = new Hokages("Tobirama Senju");
        System.out.println(Tobirama.nome);

        Hokages Hiruzen = new Hokages(40);
        System.out.println(Hiruzen.idade);

        Hokages Minato = new Hokages("Minato Namikaze", 32, false);
        System.out.println(Minato.nome + Minato.idade);*/

    }
}

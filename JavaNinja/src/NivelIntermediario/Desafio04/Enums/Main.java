package NivelIntermediario.Desafio04.Enums;

public class Main {
    static void main() {


        Gennin konohamaru = new Gennin("Konohamaru Sarutobi", 8, "Jutsu Sexy", TipoHabilidade.NINJUTSU);
        konohamaru.mostrarInformacoes();
        Chuunin shikamaru = new Chuunin("Shikamaru Nara", 13, "Posseção das Sombras", "QI", TipoHabilidade.NINJUTSU);
        shikamaru.mostrarInformacoes();


        Chuunin sasuke = new Chuunin();
        Chuunin itachi = new Chuunin("Itachi Uchiha", 22, "Mangekyou", "Reino do Pesadelo", TipoHabilidade.GENJUTSU);
        itachi.mostrarInformacoes();
        Gennin rockLee = new Gennin("Rock Lee", 13, "8 portões", TipoHabilidade.TAIJUTSU);
        rockLee.mostrarInformacoes();

        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 14;
        sasuke.habilidade = "Bola de Fogo";
        sasuke.especialidade = "Genjutsu";
        sasuke.tipoHabilidade = TipoHabilidade.KATON;
        sasuke.mostrarInformacoes();
        sasuke.executarHabilidade();

        Gennin gaara = new Gennin();

        gaara.nome = "Gaara do Deserto";
        gaara.idade = 14;
        gaara.habilidade = "Defesa perfeita";
        gaara.tipoHabilidade = TipoHabilidade.NINJUTSU;
        gaara.mostrarInformacoes();
        gaara.executarHabilidade();


    }
}

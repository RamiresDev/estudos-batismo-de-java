package NivelIntermediario.Desafio03;

public class Uchiha extends Ninja {

    public String ativarHabilidadeEspecial(){
        if (idade >= 12) {
            habilidadeEspecial = "Sharingan";
        }
        return habilidadeEspecial;
    }
    @Override
    public void mostrarInformacoes() {
        switch(rankDoNinja) {
            case 1:
                missao = "Missão das máscaras dos gatos Ninja";
                nivelDificuldade = "RANK C";
                if (idade >= 10){
                    statusMissao = "Concluída";
                } else {
                    statusMissao = "Não feita/A fazer";
                }
                break;
            case 2:
                missao = "Infiltrar-se na vila da névoa";
                nivelDificuldade = "RANK B";
                if (idade <= 20){
                    statusMissao = "Não feita/A fazer";
                } else {
                    statusMissao = "Concluída";
                }
                break;
            case 3:
                missao = "Colocar 10 Ninjas em um Genjutsu";
                nivelDificuldade = "RANK A";
                if (idade >= 25){
                    statusMissao = "Concluída";
                } else {
                    statusMissao = "Não feita/A fazer";
                }
                break;
            case 4:
                missao = "Dominar Besta de Cauda que atacou a Vila";
                nivelDificuldade = "RANK S";
                if (idade >= 30){
                    statusMissao = "Concluída";
                } else {
                    statusMissao = "Não feita/A fazer";
                }
                break;
            default:
                System.out.println("\nNÚMERO NÃO CORRESPONDENTE.");
                break;
        }
        System.out.println("Nome: " + nome +"\nIdade: " + idade + "\nMissão: " + missao + "\nRank da Missão: " + nivelDificuldade + "\nStatus da Missão: " + statusMissao + "\nKekkei Genkai: " + habilidadeEspecial);
    }
}

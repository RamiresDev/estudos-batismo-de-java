package NivelIntermediario.Lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {

        List<String> ninjasList = new ArrayList<>();
        // Adicionar na lista
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Tobirama Senju");

        System.out.println("Ninjas: "+ninjasList);

        // Remover da lista
        ninjasList.remove(0);
        System.out.println("Novos ninjas: "+ninjasList);

        // Trocar elementos
        ninjasList.set(0, "Sasuke Uchiha");
        System.out.println("Troca ninja: "+ninjasList);

        // Ver tamanho da lista
        System.out.println("Tamanho da lista: "+ninjasList.size()+" elementos");

    }
}

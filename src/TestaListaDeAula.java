import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
    public static void main(String[] args) {
        Aula a1 = new Aula("Revisitando as ArrayList", 21);
        Aula a2 = new Aula("Lista de objetos", 16);
        Aula a3 = new Aula("Relacionamento de lista de objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);
        // Comparando pelo método compareTo da classe Aula
        Collections.sort(aulas);
        // Comparando pelo tempo de cada aula
        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);
    }
}

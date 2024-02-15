import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    String aula1 = "Conhecendo mais de listas";
    String aula2 = "Modelando a classe Aula";
    String aula3 = "Trabalhando com Cursos e Sets";

    ArrayList<String> aulas = new ArrayList<>();
    aulas.add(aula1);
    aulas.add(aula2);
    aulas.add(aula3);

    for (int i = 0; i < aulas.size(); i++) {
      System.out.println("Aula: " + aulas.get(i));
    }

    // Ordenando por órdem alfabética.
    Collections.sort(aulas);

    System.out.println(aulas);
  }
}

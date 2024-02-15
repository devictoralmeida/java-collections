import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
  public static void main(String[] args) {
    Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
    javaColecoes.adiciona(new Aula("Revisitando as ArrayList", 21));
    javaColecoes.adiciona(new Aula("Lista de objetos", 16));
    javaColecoes.adiciona(new Aula("Relacionamento de lista de objetos", 15));

    List<Aula> aulasImutaveis = javaColecoes.getAulas();
    // Criando uma lista mutável
    List<Aula> aulasMutaveis = new ArrayList<Aula>(aulasImutaveis);

    System.out.println(aulasMutaveis);
    Collections.sort(aulasMutaveis);
    System.out.println(aulasMutaveis);
  }
}

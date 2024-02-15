import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAlunos {
  public static void main(String[] args) {
    Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
    javaColecoes.adiciona(new Aula("Revisitando as ArrayList", 21));
    javaColecoes.adiciona(new Aula("Lista de objetos", 16));
    javaColecoes.adiciona(new Aula("Relacionamento de lista de objetos", 15));

    Aluno turini = new Aluno("Rodrigo Turini", 34672);
    Aluno a2 = new Aluno("Guilherme Silveira", 5617);
    Aluno a3 = new Aluno("Mauricio Aniche", 17645);

    javaColecoes.matricula(turini);
    javaColecoes.matricula(a2);
    javaColecoes.matricula(a3);

    Set<Aluno> alunos = javaColecoes.getAlunos();
    Iterator<Aluno> iterador = alunos.iterator();

    // Para saber se há mais um item a ser iterádo na lista:
    // iterador.hasNext();
    // Pegando o próximo elemento da lista:
    // iterador.next();
    while (iterador.hasNext()) {
      Aluno proximo = iterador.next();
      System.out.println(proximo);
    }
  }
}

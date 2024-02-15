public class BuscaAlunosNoCurso {
  public static void main(String[] args) {
    Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
    javaColecoes.adiciona(new Aula("Revisitando as ArrayList", 21));
    javaColecoes.adiciona(new Aula("Lista de objetos", 16));
    javaColecoes.adiciona(new Aula("Relacionamento de lista de objetos", 15));

    Aluno a1 = new Aluno("Rodrigo Turini", 34672);
    Aluno a2 = new Aluno("Guilherme Silveira", 5617);
    Aluno a3 = new Aluno("Mauricio Aniche", 17645);

    javaColecoes.matricula(a1);
    javaColecoes.matricula(a2);
    javaColecoes.matricula(a3);

    javaColecoes.buscaMatriculado(5617);
  }
}

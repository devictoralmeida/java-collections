public class TestaCurso {
  public static void main(String[] args) {
    Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
//    List<Aula> aulas = javaColecoes.getAulas();
//    aulas.add(new Aula("Revisitando as ArrayList", 21));
//    aulas.add(new Aula("Lista de objetos", 16));
//    aulas.add(new Aula("Relacionamento de lista de objetos", 15));

    javaColecoes.adiciona(new Aula("Revisitando as ArrayList", 21));
    javaColecoes.adiciona(new Aula("Lista de objetos", 16));
    javaColecoes.adiciona(new Aula("Relacionamento de lista de objetos", 15));
    // Não foi necessário fazer um set aulas, pois a referência com o getAulas é a mesma
//    System.out.println(javaColecoes.getAulas() == aulas);
  }
}

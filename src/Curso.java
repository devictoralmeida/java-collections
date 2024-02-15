import java.util.*;

public class Curso {
  private final String nome;
  private final String instrutor;
  // Aqui usamos List pq vamos encasular quem está dentro
  private List<Aula> aulas = new LinkedList<Aula>();
  private Set<Aluno> alunos = new HashSet<Aluno>();
  private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

  public Curso(String nome, String instrutor) {
    if (nome == null) {
      throw new NullPointerException("Nome não pode ser nulo");
    }

    this.nome = nome;
    this.instrutor = instrutor;
  }

  public String getNome() {
    return nome;
  }

  public String getInstrutor() {
    return instrutor;
  }

  public List<Aula> getAulas() {
    // Devolvendo apenas uma referência readonly que não pode ser modificada, mantendo o encapsulamento, onde apenas o
    // obj pode modificar seus atributos.
    return Collections.unmodifiableList(aulas);
  }

  public Set<Aluno> getAlunos() {
    return Collections.unmodifiableSet(alunos);
  }

  public void adiciona(Aula aula) {
    this.aulas.add(aula);
  }

  public int getTempoTotal() {
    return this.aulas.stream().mapToInt(Aula::getTempo).sum();
  }

  public void matricula(Aluno aluno) {
    this.alunos.add(aluno);
    this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
  }

  public boolean estaMatriculado(Aluno aluno) {
    return this.alunos.contains(aluno);
  }

  public Aluno buscaMatriculado(int numero) {
    // O método get recebe a chave e retorna o valor associado a ela (o aluno), caso não encontre retorna null.
    if (!matriculaParaAluno.containsKey(numero)) {
      throw new NoSuchElementException("Matrícula não encontrada");
    }
    return this.matriculaParaAluno.get(numero);
  }

  @Override
  public boolean equals(Object obj) {
    Aluno outroAluno = (Aluno) obj;
    return this.nome.equals(outroAluno.getNome());
  }

  @Override
  public int hashCode() {
    return this.nome.hashCode();
  }
}

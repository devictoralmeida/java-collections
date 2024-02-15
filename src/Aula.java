// A interface Comparable permite ter um método que irá comparar 2 instâncias do objeto, de acordo com algum parâmetro, para ser possível ordená-las em uma lista.
public class Aula implements Comparable<Aula>{

    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    // Sobrescrevendo o método toString de objetos, que é chamando no system out print.
    @Override
    public String toString() {
        return "Aula: " + this.titulo + ", " + this.tempo + " minutos";
    }

    // Vamos criar um método de ordenação de acórdo com a órdem alfabética do título.
    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.titulo);
    }
}

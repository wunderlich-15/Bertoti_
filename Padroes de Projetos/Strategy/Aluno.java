public class Aluno {
    private String nome;
    private EstrategiaAvaliacao estrategia;

    public Aluno(String nome, EstrategiaAvaliacao estrategia) {
        this.nome = nome;
        this.estrategia = estrategia;
    }

    public double calcularNotaFinal(double notaProva, double notaTrabalho) {
        return estrategia.calcularNotaFinal(notaProva, notaTrabalho);
    }

    public String getNome() {
        return nome;
    }
}
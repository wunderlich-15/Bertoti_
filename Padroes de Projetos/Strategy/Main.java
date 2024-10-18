public class Main {
    public static void main(String[] args) {
        double notaProva = 8.0;
        double notaTrabalho = 7.5;

        // Aluno usando Média Simples
        Aluno aluno1 = new Aluno("João Silva", new MediaSimples());
        System.out.printf("Nota final de %s: %.2f%n", aluno1.getNome(), aluno1.calcularNotaFinal(notaProva, notaTrabalho));

        // Aluno usando Peso Maior na Prova
        Aluno aluno2 = new Aluno("Maria Oliveira", new PesoMaiorProva());
        System.out.printf("Nota final de %s: %.2f%n", aluno2.getNome(), aluno2.calcularNotaFinal(notaProva, notaTrabalho));

        // Aluno usando Peso Maior no Trabalho
        Aluno aluno3 = new Aluno("Pedro Santos", new PesoMaiorTrabalho());
        System.out.printf("Nota final de %s: %.2f%n", aluno3.getNome(), aluno3.calcularNotaFinal(notaProva, notaTrabalho));
    }
}
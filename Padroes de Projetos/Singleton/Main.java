package Singleton;
public class Main {
    public static void main(String[] args) {
        // Obtendo a instância única da escola
        Escola escola = Escola.getInstancia();

        // Criando alunos
        Aluno aluno1 = new Aluno("Alice");
        Aluno aluno2 = new Aluno("Bob");

        // Criando professores
        Professor professor1 = new Professor("Dr. Silva");
        Professor professor2 = new Professor("Profa. Oliveira");

        // Criando turmas
        Turma turma1 = new Turma("Turma A");
        turma1.adicionarComponente(aluno1);
        turma1.adicionarComponente(professor1);

        Turma turma2 = new Turma("Turma B");
        turma2.adicionarComponente(aluno2);
        turma2.adicionarComponente(professor2);

        // Adicionando turmas à escola
        escola.adicionarTurma(turma1);
        escola.adicionarTurma(turma2);

        // Mostrando informações das turmas
        escola.mostrarTurmas();
    }
}

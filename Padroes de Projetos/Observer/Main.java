package Observer;

public class Main {
    public static void main(String[] args) {
        // Criar alunos
        Aluno aluno1 = new Aluno("João Silva", 8.0);
        Aluno aluno2 = new Aluno("Maria Oliveira", 7.5);

        // Criar professores
        Professor professor1 = new Professor("Dr. Fernandes");
        Professor professor2 = new Professor("Profa. Costa");

        // Adicionar professores como observadores dos alunos
        aluno1.adicionarObservador(professor1);
        aluno1.adicionarObservador(professor2);
        aluno2.adicionarObservador(professor1);

        // Alterar notas e notificar observadores
        aluno1.setNota(9.0);
        aluno2.setNota(8.0);
    }
}


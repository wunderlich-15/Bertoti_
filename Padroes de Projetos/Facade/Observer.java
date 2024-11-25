import java.util.ArrayList;
import java.util.List;

interface AlunoObserver {
    void atualizar(String mensagem);
}


class Aluno implements AlunoObserver {
    private String nome;
    
    public Aluno(String nome) {
        this.nome = nome;
    }
    
    public void atualizar(String mensagem) {
        System.out.println(nome + " recebeu a mensagem: " + mensagem);
    }
}


class Escola {
    private List<AlunoObserver> alunos = new ArrayList<>();
    
    public void adicionarAluno(AlunoObserver aluno) {
        alunos.add(aluno);
    }
    
    public void notificarAlunos(String mensagem) {
        for (AlunoObserver aluno : alunos) {
            aluno.atualizar(mensagem);
        }
    }
}

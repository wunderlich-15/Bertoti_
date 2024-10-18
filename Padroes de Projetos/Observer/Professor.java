package Observer;
public class Professor implements Observer {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String nomeAluno, double novaNota) {
        System.out.printf("Professor %s foi notificado: Nota do aluno %s foi alterada para %.2f%n", nome, nomeAluno, novaNota);
    }
}

public class Main {
    public static void main(String[] args) {
        EstrategiaEnsino estrategiaTradicional = new EnsinoTradicional();
        EstrategiaEnsino estrategiaInterativa = new EnsinoInterativo();
        EstrategiaEnsino estrategiaOnline = new EnsinoOnline();
        
        Escola escola = new Escola();
        Aluno aluno1 = new Aluno("Maria");
        Aluno aluno2 = new Aluno("João");
        
        escola.adicionarAluno(aluno1);
        escola.adicionarAluno(aluno2);
        
        escola.notificarAlunos("Aula de Matemática foi alterada!");
        
        System.out.println(estrategiaTradicional.ensinar());
        System.out.println(estrategiaInterativa.ensinar());
        System.out.println(estrategiaOnline.ensinar());
        
        TurmaComposite turma = new TurmaComposite();
        turma.adicionar(new AlunoComposite("Maria"));
        turma.adicionar(new AlunoComposite("João"));
        turma.adicionar(new ProfessorComposite("Prof. Carlos"));
        turma.exibir();
        
        EscolaSingleton escolaSingleton1 = EscolaSingleton.getInstancia();
        EscolaSingleton escolaSingleton2 = EscolaSingleton.getInstancia();
        escolaSingleton1.exibirNome();
        
        System.out.println(escolaSingleton1 == escolaSingleton2);
    }
}

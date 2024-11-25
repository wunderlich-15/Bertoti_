import java.util.ArrayList;
import java.util.List;

abstract class ComponenteEscola {
    abstract void exibir();
}

class AlunoComposite extends ComponenteEscola {
    private String nome;
    
    public AlunoComposite(String nome) {
        this.nome = nome;
    }
    
    public void exibir() {
        System.out.println("Aluno: " + nome);
    }
}

class ProfessorComposite extends ComponenteEscola {
    private String nome;
    
    public ProfessorComposite(String nome) {
        this.nome = nome;
    }
    
    public void exibir() {
        System.out.println("Professor: " + nome);
    }
}

class TurmaComposite extends ComponenteEscola {
    private List<ComponenteEscola> componentes = new ArrayList<>();
    
    public void adicionar(ComponenteEscola componente) {
        componentes.add(componente);
    }
    
    public void exibir() {
        for (ComponenteEscola componente : componentes) {
            componente.exibir();
        }
    }
}

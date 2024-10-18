package Composite;

import java.util.ArrayList;
import java.util.List;

class Turma implements ComponenteEscola {
    private String nome;
    private List<ComponenteEscola> componentes = new ArrayList<>();

    public Turma(String nome) {
        this.nome = nome;
    }

    public void adicionarComponente(ComponenteEscola componente) {
        componentes.add(componente);
    }

    public void removerComponente(ComponenteEscola componente) {
        componentes.remove(componente);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Turma: " + nome);
        for (ComponenteEscola componente : componentes) {
            componente.mostrarInformacoes();
        }
    }
}

package Singleton;

import java.util.List;
import java.util.ArrayList;

class Escola {
    private static Escola instancia;
    private List<Turma> turmas = new ArrayList<>();

    private Escola() {
        // Construtor privado para evitar instâncias externas
    }

    public static Escola getInstancia() {
        if (instancia == null) {
            instancia = new Escola();
        }
        return instancia;
    }

    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }

    public void mostrarTurmas() {
        for (Turma turma : turmas) {
            turma.mostrarInformacoes();
        }
    }
}
package Observer;
import java.util.ArrayList;
import java.util.List;

public class Aluno implements Subject {
    private String nome;
    private double nota;
    private List<Observer> observers;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
        this.observers = new ArrayList<>();
    }

    public void setNota(double novaNota) {
        this.nota = novaNota;
        notificarObservadores();
    }

    public double getNota() {
        return nota;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void adicionarObservador(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObservador(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservadores() {
        for (Observer observer : observers) {
            observer.atualizar(nome, nota);
        }
    }
}

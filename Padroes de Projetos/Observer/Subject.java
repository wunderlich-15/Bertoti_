package Observer;
public interface Subject {
    void adicionarObservador(Observer observador);
    void removerObservador(Observer observador);
    void notificarObservadores();
}

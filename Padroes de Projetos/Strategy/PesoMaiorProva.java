// ConcreteStrategy B - Peso Maior na Prova
public class PesoMaiorProva implements EstrategiaAvaliacao {
    @Override
    public double calcularNotaFinal(double notaProva, double notaTrabalho) {
        return (notaProva * 0.7) + (notaTrabalho * 0.3);
    }
}
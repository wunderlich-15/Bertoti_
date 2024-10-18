// ConcreteStrategy C - Peso Maior no Trabalho
public class PesoMaiorTrabalho implements EstrategiaAvaliacao {
    @Override
    public double calcularNotaFinal(double notaProva, double notaTrabalho) {
        return (notaProva * 0.4) + (notaTrabalho * 0.6);
    }
}
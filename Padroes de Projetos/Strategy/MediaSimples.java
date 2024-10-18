public class MediaSimples implements EstrategiaAvaliacao {
    @Override
    public double calcularNotaFinal(double notaProva, double notaTrabalho) {
        return (notaProva + notaTrabalho) / 2;
    }
}

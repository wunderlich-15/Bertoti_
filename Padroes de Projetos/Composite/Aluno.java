package Composite;

class Aluno implements ComponenteEscola {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Aluno: " + nome);
    }
}

package Singleton;

class Professor implements ComponenteEscola {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Professor: " + nome);
    }
}

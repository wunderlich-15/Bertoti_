class EscolaSingleton {
    private static EscolaSingleton instancia;
    
    private EscolaSingleton() {}
    
    public static EscolaSingleton getInstancia() {
        if (instancia == null) {
            instancia = new EscolaSingleton();
        }
        return instancia;
    }
    
    public void exibirNome() {
        System.out.println("Escola: ABC");
    }
}

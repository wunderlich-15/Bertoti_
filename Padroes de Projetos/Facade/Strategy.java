interface EstrategiaEnsino {
    String ensinar();
}

class EnsinoTradicional implements EstrategiaEnsino {
    public String ensinar() {
        return "Aula expositiva com quadro e livro.";
    }
}

class EnsinoInterativo implements EstrategiaEnsino {
    public String ensinar() {
        return "Aula com atividades práticas e discussões em grupo.";
    }
}

class EnsinoOnline implements EstrategiaEnsino {
    public String ensinar() {
        return "Aula via plataforma online com vídeos e fóruns.";
    }
}

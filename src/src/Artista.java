public class Artista {

    private String nome;
    private Funcao funcao;

    public Artista(String nome, Funcao funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    public void executarFuncao() {
        funcao.executarFuncao();
    }
}


public class Musico extends Pessoa{

    private Funcao funcao;
    private String banda;

    public Musico(String nome, Funcao funcao, String banda) {
        super(nome);
        this.funcao = funcao;
        this.banda = banda;
    }

    public String executarFuncao() {
        return getNome() + funcao.executarFuncao();
    }

    public String executarFuncao(String musica) {
        return getNome()+ funcao.executarFuncao(musica);
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }
}


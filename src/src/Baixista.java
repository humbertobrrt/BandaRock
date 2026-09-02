public class Baixista implements Funcao {

    @Override
    public String executarFuncao() {
        return " está improvisando no baixo!";
    }

    @Override
    public String executarFuncao(String musica) {
        return " está tocando a linha de baixo de " + musica + "!";
    }
}

public class Baterista implements Funcao {

    @Override
    public String executarFuncao() {
        return " está improvisando na bateria!";
    }

    @Override
    public String executarFuncao(String musica) {
        return " está quebrando tudo em " + musica + "!";
    }
}

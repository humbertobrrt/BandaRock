public class Vocalista implements Funcao {

    @Override
    public String executarFuncao() {
        return " está cantarolando!";
    }

    @Override
    public String executarFuncao(String musica) {
        return " está cantando " + musica + "!";
    }

}

public class Guitarrista implements Funcao {

    @Override
    public String executarFuncao() {
        return " está improvisando na guitarra!";
    }

    @Override
    public String executarFuncao(String musica) {
        return " está tocando o riff de " + musica + "!";
    }

}
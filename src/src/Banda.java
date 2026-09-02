import java.util.ArrayList;
import java.util.List;

public class Banda {

    private String nomeBanda;

    public Banda(String nomeBanda) {
        this.nomeBanda = nomeBanda;
    }

    private List<Musico> membrosBanda = new ArrayList<>();

    public void adicionarMembro(Musico musico) {
        membrosBanda.add(musico);
    }

    private boolean isFormacaoOriginal() {
        for (Musico musico : membrosBanda) {
            if (!musico.getBanda().equalsIgnoreCase(this.nomeBanda)) {
                return false;
            }
        }
        return true;
    }

    public void iniciarShow() {
        for (Musico musico : membrosBanda) {
            System.out.println(musico.executarFuncao());
        }
        if (isFormacaoOriginal()) {
            System.out.println(this.nomeBanda + " está improvisando algo incrível!");
        } else {
            System.out.println("Um novo feat está nascendo diante dos nossos olhos!");
        }
    }

    public void iniciarShow(String musica) {
        for (Musico musico : membrosBanda) {
            System.out.println(musico.executarFuncao(musica));
        }
        if (isFormacaoOriginal()) {
            System.out.println(this.nomeBanda + " está tocando um de seus sucessos!");
        } else {
            System.out.println("Estamos presenciando uma colaboração histórica em " + musica + "!");
        }
    }

}

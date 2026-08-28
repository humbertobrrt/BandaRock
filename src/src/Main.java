//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Artista freddie = new Artista("Freddie Mercury", new Vocalista());
    Artista brian = new Artista("Brian May", new Guitarrista());
    Artista roger = new Artista("Roger Taylor", new Baterista());
    Artista john = new Artista("John Deacon", new Baixista());

    freddie.executarFuncao();
    brian.executarFuncao();
    roger.executarFuncao();
    john.executarFuncao();

}

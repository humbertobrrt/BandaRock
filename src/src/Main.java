import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("BEM VINDO! FAÇA O CADASTRO DO SEU SHOW:");

        System.out.println("Qual o nome da banda principal do show?");
        String nomeBanda = teclado.nextLine();
        Banda bandaPrincipal = new Banda(nomeBanda);

        boolean cadastrando = true;

        while (cadastrando) {

            System.out.println("CADASTRANDO MÚSICOS NO SHOW:");

            System.out.println("Qual o nome do músico a ser cadastrado?");
            String nomeMusico = teclado.nextLine();

            Funcao funcaoMusico = null;
            boolean opcaoValidacao = false;

            while (!opcaoValidacao) {

                System.out.println("Qual a função de " + nomeMusico + "?\n1- Vocalista\n2- Guitarrista\n3- Baixista\n4- Baterista\n(digite o número correspondente)");
                int opcao = teclado.nextInt();

                switch (opcao) {

                    case 1:
                        funcaoMusico = new Vocalista();
                        opcaoValidacao = true;
                        break;

                    case 2:
                        funcaoMusico = new Guitarrista();
                        opcaoValidacao = true;
                        break;

                    case 3:
                        funcaoMusico = new Baixista();
                        opcaoValidacao = true;
                        break;

                    case 4:
                        funcaoMusico = new Baterista();
                        opcaoValidacao = true;
                        break;

                    default:
                        System.out.println("Opção inválida! Por favor, digite um número de 1 a 4.\n");
                        break;
                }
            }
            teclado.nextLine();

            System.out.println("De qual banda " + nomeMusico + " faz parte?");
            String bandaMusico = teclado.nextLine();

            Musico novoMusico = new Musico(nomeMusico, funcaoMusico, bandaMusico);
            bandaPrincipal.adicionarMembro(novoMusico);

            boolean respostaValidacao = false;

            while (!respostaValidacao) {
                System.out.println("Deseja adicionar mais algum músico ao show? (s/n)");
                String resposta = teclado.nextLine();

                if (resposta.equalsIgnoreCase("s")) {
                    respostaValidacao = true;
                } else if (resposta.equalsIgnoreCase("n")) {
                    respostaValidacao = true;
                    cadastrando = false;
                } else {
                    System.out.println("Opção inválida! Por favor, digite s ou n.\n");
                }
            }
        }

        boolean showValido = false;

        while (!showValido) {
            System.out.println("O cadastro foi encerrado. Qual será o formato do show?");
            System.out.println("1- Tocar música específica\n2- Fazer Jam Session (improviso)\n(digite o número correspondente)");
            int escolhaShow = teclado.nextInt();

            System.out.println("O SHOW VAI COMEÇAR!");

            switch (escolhaShow) {
                case 1:
                    teclado.nextLine();
                    System.out.println("Qual música a banda vai tocar?");
                    String musica = teclado.nextLine();

                    bandaPrincipal.iniciarShow(musica);
                    showValido = true;
                    break;

                case 2:
                    bandaPrincipal.iniciarShow();
                    showValido = true;
                    break;

                default:
                    System.out.println("Opção inválida! Escolha 1 ou 2.\n");
                    break;
            }
        }

    }
}
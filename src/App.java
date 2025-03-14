public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        iphone.exibirPagina("https://www.globo.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        iphone.ligar("+553211989857676");
        iphone.atender();
        iphone.iniciarCorreioVox();

        iphone.selecionarMusica("Mulher de fases");
        iphone.tocar();
        iphone.pauser();
    }
}

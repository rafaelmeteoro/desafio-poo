public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibir página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar pagina");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligar para número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atender");
    }

    @Override
    public void iniciarCorreioVox() {
        System.out.println("Iniciar correio de voz");
    }

    @Override
    public void tocar() {
        System.out.println("Tocar");
    }

    @Override
    public void pauser() {
        System.out.println("Pausar");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica " + musica + " selecionada");
    }
}

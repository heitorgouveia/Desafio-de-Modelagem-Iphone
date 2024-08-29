package aparelho.iphone;

import aparelho.AparelhoTelefonico;
import aparelho.DispositivoInternet;
import aparelho.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, DispositivoInternet {
    

    @Override
    public void exibirPagina(String url) {
        url = "www.tocandomusica.com";
        System.out.println(url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void ligar(String numero) {
        numero = "619999999";
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        musica ="In the end - Link Park";
        System.out.println("Selecionando música: " + musica);

}
}
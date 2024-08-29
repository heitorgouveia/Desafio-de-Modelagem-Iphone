package aparelho.iphone;

public class Aparelho {
    public static void main(String[] args) {
        Iphone iph = new Iphone();
        System.out.println("Funções de Internet");
    iph.exibirPagina(null);
    iph.adicionarNovaAba();
    iph.atualizarPagina();
    System.out.println("Funções de telefone");
    iph.ligar(null);
    iph.atender();
    iph.iniciarCorreioVoz();
    System.out.println("Funções de Reprodutor de música");
    iph.tocar();
    iph.pausar();
    iph.selecionarMusica(null);
    }
    
}

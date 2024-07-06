package iphonePOO;

public class ReproduzirMusica extends iphone {
    private String musicaAtual;

    public void tocarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Tocando música: " + musica);
    }

    public void pausarMusica() {
        System.out.println("Música pausada: " + musicaAtual);
    }

    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Reprodutor de Música");
    }
}



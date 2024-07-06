package iphonePOO;

public class TocarVideo extends iphone {
    @Override
    public void exibirInformacoes() {
        System.out.println("Reprodutor de Vídeo");
    }

    public void reproduzirVideo(String video) {
        System.out.println("Reproduzindo vídeo: " + video);
    }

    public void pausarVideo() {
        System.out.println("Vídeo pausado");
    }
}


package iphonePOO;

public class NavegarInternet extends iphone {
    @Override
    public void exibirInformacoes() {
        System.out.println("Navegador de Internet");
    }

    public void acessarSite(String url) {
        System.out.println("Acessando: " + url);
    }
    
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }
    
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }
}

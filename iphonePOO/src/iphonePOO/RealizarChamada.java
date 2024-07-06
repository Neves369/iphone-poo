package iphonePOO;

public class RealizarChamada extends iphone {
    @Override
    public void exibirInformacoes() {
        System.out.println("Realizador de Chamadas");
    }

    public void fazerChamada(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atenderChamada(String numero) {
        System.out.println("Atendendo chamada do número: " + numero);
    }
    
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correiro de voz");
    }
    
    public void encerrarChamada() {
        System.out.println("Chamada encerrada");
    }
}

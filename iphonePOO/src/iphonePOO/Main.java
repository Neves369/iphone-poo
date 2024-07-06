package iphonePOO;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma funcionalidade: 1- Música, 2- Internet, 3- Chamada, 4- Vídeo");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        switch (escolha) {
            case 1:
                ReproduzirMusica musica = new ReproduzirMusica();
                musica.exibirInformacoes();
                System.out.println("Selecione uma música:");
                String musicaEscolhida = scanner.nextLine();
                musica.selecionarMusica(musicaEscolhida);
                musica.tocarMusica(musicaEscolhida);
                musica.pausarMusica();
                break;
            case 2:
                NavegarInternet internet = new NavegarInternet();
                internet.exibirInformacoes();
                System.out.println("Digite a URL do site:");
                String url = scanner.nextLine();
                internet.acessarSite(url);
                break;
            case 3:
                RealizarChamada chamada = new RealizarChamada();
                chamada.exibirInformacoes();
                System.out.println("Digite o número para ligar:");
                String numero = scanner.nextLine();
                chamada.fazerChamada(numero);
                chamada.encerrarChamada();
                break;
            case 4:
                TocarVideo video = new TocarVideo();
                video.exibirInformacoes();
                System.out.println("Digite o nome do vídeo:");
                String nomeVideo = scanner.nextLine();
                video.reproduzirVideo(nomeVideo);
                video.pausarVideo();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
	}
}
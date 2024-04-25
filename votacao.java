import java.util.ArrayList;
import java.util.Scanner;

public class votacao {
    public votacao(ArrayList<Jogador> jogadores) {
    }

    public static void votacao(ArrayList<Jogador> jogadores) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Votação iniciada. Digite o nome do participante que você quer eliminar ou 'sair' para encerrar:");
        String voto = scanner.nextLine();

        while (!voto.equalsIgnoreCase("sair")) {
            boolean encontrado = false;
            for (Jogador jogador : jogadores) {
                if (jogador.getNome().equalsIgnoreCase(voto)) {
                    jogador.incrementaUmVoto();
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Participante não encontrado. Por favor, digite o nome novamente ou 'sair' para encerrar:");
            } else {
                break;
            }
            voto = scanner.nextLine();
        }
        scanner.close();
    }
}

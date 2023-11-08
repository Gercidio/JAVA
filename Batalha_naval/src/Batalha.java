import java.util.Scanner;

public class Batalha {
    private int tamanhoTabuleiro = 5; // Tamanho do tabuleiro
    private int[][] tabuleiro = new int[tamanhoTabuleiro][tamanhoTabuleiro];

    public void iniciarJogo() {
        inicializarTabuleiro();
        colocarNavios();
        jogar();
    }

    private void inicializarTabuleiro() {
        for (int i = 0; i < tamanhoTabuleiro; i++) {
            for (int j = 0; j < tamanhoTabuleiro; j++) {
                tabuleiro[i][j] = 0; // 0 = água
            }
        }
    }

    private void colocarNavios() {
        // Colocar 3 navios em posições aleatórias no tabuleiro
        for (int n = 0; n < 3; n++) {
            int x = (int) (Math.random() * tamanhoTabuleiro);
            int y = (int) (Math.random() * tamanhoTabuleiro);
            if (tabuleiro[x][y] != 1) {
                tabuleiro[x][y] = 1; // 1 = um navio
            } else {
                n--; // Se a posição já tiver um navio, tente novamente
            }
        }
    }

    private void jogar() {
        Scanner scanner = new Scanner(System.in);

        int tentativas = 0;
        int naviosAfundados = 0;

        while (naviosAfundados < 3) {
            System.out.println("Tentativa #" + (tentativas + 1));
            System.out.print("Informe a linha: ");
            int linha = scanner.nextInt();
            System.out.print("Informe a coluna: ");
            int coluna = scanner.nextInt();

            if (linha < 0 || linha >= tamanhoTabuleiro || coluna < 0 || coluna >= tamanhoTabuleiro) {
                System.out.println("Posição inválida. Tente novamente.");
                continue;
            }

            if (tabuleiro[linha][coluna] == 1) {
                System.out.println("Você acertou um navio!");
                tabuleiro[linha][coluna] = 2; // 2 = um navio afundado
                naviosAfundados++;
            } else if (tabuleiro[linha][coluna] == 2) {
                System.out.println("Você já afundou este navio. Tente novamente.");
            } else {
                System.out.println("Você atingiu água.");
            }

            tentativas++;
        }

        System.out.println("Parabéns! Você afundou todos os navios em " + tentativas + " tentativas.");
        scanner.close();
    }

    public static void main(String[] args) {
        Batalha jogo = new Batalha();
        jogo.iniciarJogo();
    }
}

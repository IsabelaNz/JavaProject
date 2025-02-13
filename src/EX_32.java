import java.util.Random;
import java.util.Scanner;

public class EX_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int[] opcoes = {1, 2, 3, 4, 5};

        int computador = opcoes[random.nextInt(5)];
        int usuario = 0;

        while (usuario != computador) {
            System.out.println("Escolha um número de 1 a 5");
            usuario = scanner.nextInt();

            if (usuario < 1 || usuario > 5) {
                System.out.println("Entrada inválida! Digite um número entre 1 e 5");
                continue;
            } else if (usuario == computador) {
                System.out.println("Parabéns, você acertou, o computador escolheu: " + computador);
            } else {
                System.out.println("Você errou!. Tente novamente.");
            }
        }
    }
}
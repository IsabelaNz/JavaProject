import java.util.Random;
import java.util.Scanner;

public class EX_55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int computador = random.nextInt(10) + 1;
        int tentativas = 4;
        int usuario;

        System.out.println("Tente adivinhar o número que o computador escolheu (entre 1 e 10)");
        System.out.println("Você tem " + tentativas + " tentativas!");

        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + ": ");
            usuario = scanner.nextInt();

            if (usuario < 1 || usuario > 10) {
                System.out.println("Entrada inválida! Digite um número entre 1 e 10");
                i--; // não conta tentativa inválida
                continue;
            }

            if (usuario == computador) {
                System.out.println("Parabéns! Você acertou! O número era " + computador);
                return;
            } else {
                System.out.println("Errado!");
                if (i < tentativas) {
                    System.out.println("Tente novamente...");
                }
            }
        }

        System.out.println("Suas tentativas acabaram. O número era " + computador + ".");
        scanner.close();
    }
}

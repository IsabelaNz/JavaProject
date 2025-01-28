import java.util.Scanner;

public class EX_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto de dinheiro você tem na carteira ?");
        double real = scanner.nextDouble();

        double cotacao = 3.45;

        double reaisEmDolares = real / cotacao;

        System.out.printf("Você pode comprar %.2f dólares.\n", reaisEmDolares);
    }
}

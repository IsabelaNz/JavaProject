import java.util.Scanner;

public class EX_69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro termo da PA: ");
        int primeiroTermo = scanner.nextInt();

        System.out.print("Digite a razão da PA: ");
        int razao = scanner.nextInt();

        int soma = 0;

        System.out.println("\nOs 10 primeiros termos da PA são:");

        for (int i = 0; i < 10; i++) {
            int termo = primeiroTermo + i * razao;
            System.out.print(termo + " ");
            soma += termo;
        }

        System.out.println("\n\nA soma dos termos da PA é: " + soma);

        scanner.close();
    }
}

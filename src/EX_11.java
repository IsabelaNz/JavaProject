import java.util.Scanner;

public class EX_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float valorA;

        // o do while permite que o usuário volte e coloque um número válido.

        do {
            System.out.print("Digite o valor de A (não pode ser zero): ");
            valorA = scanner.nextFloat();

            if (valorA == 0) {
                System.out.println("Erro: O valor de A não pode ser zero em uma equação do segundo grau.");
            }
        } while (valorA == 0);

        System.out.print("Digite o valor de B: ");
        float valorB = scanner.nextFloat();

        System.out.print("Digite o valor de C: ");
        float valorC = scanner.nextFloat();

        float delta = (valorB * valorB) - (4 * valorA * valorC);
        System.out.printf("O valor de delta é %.2f\n", delta);

        scanner.close();
    }
}

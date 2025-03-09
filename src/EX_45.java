import java.util.Scanner;

public class EX_45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor1, valor2, incremento;

        while (true) {
            System.out.print("Digite o primeiro valor (menor número): ");
            valor1 = scanner.nextInt();

            System.out.print("Digite o segundo valor (maior número): ");
            valor2 = scanner.nextInt();

            if (valor1 < valor2) {
                break;
            } else {
                System.out.println("Erro! O primeiro valor deve ser menor que o segundo. Tente novamente.");
            }
        }

        while (true) {
            System.out.print("Digite o incremento (maior que 0): ");
            incremento = scanner.nextInt();

            if (incremento > 0) {
                break;
            } else {
                System.out.println("Erro! O incremento deve ser maior que zero.");
            }
        }

        System.out.print("Contagem: ");
        for (int i = valor1; i < valor2; i += incremento) {
            System.out.print(i + " ");
        }
        System.out.println("Acabou!");

        scanner.close();
    }
}

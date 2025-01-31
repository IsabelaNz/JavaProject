import java.util.Scanner;

public class EX_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro ?");
        int numero = scanner.nextInt();

        int resto = numero % 2;

        if (resto == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O númreo é ímpar");
        }
    }
}

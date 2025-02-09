import java.util.Scanner;

public class EX_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a largura do terreno: ");
        double largura = scanner.nextDouble();

        System.out.println("Digite o comprimento do terreno: ");
        double comprimento = scanner.nextDouble();

        double area = largura * comprimento;

        if (area < 100) {
            System.out.printf("O terreno tem %.2f metros quadrados e é um terreno popular.", area);
        } else if (area >= 100 && area <= 500) {
            System.out.printf("O terreno tem %.2f metros quadrados e é um terreno master.", area);
        } else if (area > 500) {
            System.out.printf("O terreno tem %.2f metros quadrados e é um terreno vip.", area);
        }
    }
}

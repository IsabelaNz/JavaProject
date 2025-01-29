import java.util.Scanner;

public class EX_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        double salario = scanner.nextDouble();

        double porcentagem = 15;
        double aumento = (porcentagem / 100) * salario;
        double valorComAumento = salario + aumento;

        System.out.printf("o valor do salário com aumento de 15%% é: R$ %.2f \n", valorComAumento);
    }
}

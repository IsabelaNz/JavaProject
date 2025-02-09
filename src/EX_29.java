import java.util.Scanner;

public class EX_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu salário: ");
        double salario = scanner.nextDouble();

        System.out.println("Quantos anos você trabalha nessa empresa: ");
        int anosTrabalhados = scanner.nextInt();

        double porcentagem = 0;

        if (anosTrabalhados == 3) {
            porcentagem = 3;
        } else if (anosTrabalhados > 3 &&  anosTrabalhados<= 10) {
            porcentagem = 12.5;
        } else {
            porcentagem = 20;
        }

        double aumento = (porcentagem / 100) * salario;
        double valorComAumento = salario + aumento;

        System.out.printf("Funcionário: %s%nSalário atual: R$ %.2f%nNovo salário: R$ %.2f%n", nome, salario, valorComAumento);
    }
}

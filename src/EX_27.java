import java.util.Locale;
import java.util.Scanner;

public class EX_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota 1 do aluno: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite a nota 2 do aluno: ");
        double n2 = scanner.nextDouble();

        double media = (n1 + n2) / 2.0;

        if (media <= 4.9) {
            System.out.printf("Sua média é %.2f e você está REPROVADO ", media);
        } else if (media >= 5 && media <= 6.9) {
            System.out.printf("Sua média é %.2f e você está de RECUPERAÇÃO ", media);
        } else if (media >= 7) {
            System.out.printf("Sua média é %.2f e você está APROVADO ", media);
        }
    }
}

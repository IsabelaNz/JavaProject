import java.util.Scanner;

public class EX_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite outro número: ");
        int n2 = scanner.nextInt();

        double media = (n1 + n2) / 2;

        System.out.println("A média do aluno é: " +media);
    }
}

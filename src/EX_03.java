import java.util.Scanner;

public class EX_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Qual é o seu salário: ");
        double salario = scanner.nextDouble();

        System.out.println("O funcionário " + nome + " tem um salário de " + salario + " em junho.");

    }
}

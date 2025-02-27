import java.util.Scanner;

public class EX_37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu salário ?");
        double salario = scanner.nextDouble();
        scanner.nextLine();

        String genero;

        while (true) {
            System.out.println("Qual é seu gênero ? (homem ou mulher)");
            genero = scanner.next();

            if (genero.equalsIgnoreCase("homem") || genero.equalsIgnoreCase("mulher")) {
                break;
            } else {
                System.out.println("Entrada inválida, digite homem ou mulher");
            }
        }

        System.out.println("Há quantos anos você trabalha na empresa ?");
        int anos = scanner.nextInt();

        double percentualAumento = 0;

        if (genero.equalsIgnoreCase("mulher")) {
            if (anos < 15) {
                percentualAumento = 0.05;
            } else if (anos <= 20) {
                percentualAumento = 0.13;
            } else  {
                percentualAumento = 0.23;
            }
        } else {
            if (anos < 20) {
                percentualAumento = 0.03;
            } else if (anos <= 30) {
                percentualAumento = 0.13;
            } else {
                percentualAumento = 0.25;
            }
        }

        double novoSalario = salario + (salario * percentualAumento);

        System.out.printf("Seu novo salário, após o reajuste de %.0f%%, será: R$ %.2f%n", percentualAumento * 100, novoSalario);
    }
}
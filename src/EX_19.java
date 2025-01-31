import java.util.Scanner;

public class EX_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o nome do aluno ? ");
        String nome = scanner.next();

        System.out.println("Qual é a primeira nota ? ");
        double nota1 = scanner.nextDouble();

        System.out.println("Qual é a segunda nota ? ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media > 7) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}

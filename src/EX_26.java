import java.util.Scanner;

public class EX_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int n2 = scanner.nextInt();

        if (n1 > n2){
            System.out.println("O primeiro valor é maior");
        } else if (n2 > n1) {
            System.out.println("O segundo valor é maior");
        } else {
            System.out.println("Não existe valor maior, os dois são iguais.");
        }
    }
}

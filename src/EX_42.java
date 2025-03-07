import java.util.Scanner;

public class EX_42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            for(int i = 1; i <= numero; i ++) {
                System.out.print(i + " ");
            }
            System.out.println("Acabou!");
        } else {
            System.out.println("Por favor, digite um número positivo");
        }
    }
}
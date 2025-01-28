import java.util.Scanner;

public class EX_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número real: ");
        Double numero = scanner.nextDouble();

        Double dobro = 2 * numero;
        Double tercaParte = numero / 3;

        System.out.println("O dobro de " + numero + " é " + dobro);
        System.out.println("A terça parte de " + numero + " é " + tercaParte);
    }
}

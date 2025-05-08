import java.util.Scanner;

public class EX_56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        while (true) {

            System.out.println("Digite um número");
            int numero = scanner.nextInt();

            if (numero == 1111) {
                break;
            }
            soma += numero;
        }
        System.out.println("Somatório dos números digitados: " + soma);
    }
}
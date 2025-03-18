import java.util.Scanner;

public class EX_48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[7];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número inteiro: ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i]; // Somando o valor digitado, não o índice
        }
        System.out.println("O resultado da soma é: " + soma);
    }
}

import java.util.Scanner;

public class EX_47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        for (int i = 500; i >= 0; i -= 50) {
            System.out.println(i + " ");
            soma += i;
        }
        System.out.println();

        System.out.println("O resultado da soma é: " + soma);
    }
}

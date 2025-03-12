import java.util.Scanner;

public class EX_46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        for (int i = 6; i <= 100; i += 2) {
            System.out.print(i + " ");
            soma += i;
        }
        System.out.println();
        System.out.println("O resultado da soma é: " + soma);
    }
}

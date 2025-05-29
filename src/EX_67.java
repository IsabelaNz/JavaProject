import java.util.Scanner;

public class EX_67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int numero = scanner.nextInt();

        System.out.print("Contagem: ");
        for (int i = 0; i <= numero; i++) {
            System.out.print(i);
            if (i < numero) {
                System.out.print(", ");
            } else {
                System.out.print(", FIM!");
            }
        }
    }
}
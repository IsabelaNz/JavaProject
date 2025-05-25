import java.util.Scanner;

public class EX_66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        System.out.println("Digite um número: ");
        numero = scanner.nextInt();

        for(int i = 0; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}

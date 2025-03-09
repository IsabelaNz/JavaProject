import java.util.Scanner;

public class EX_44 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();
        System.out.println("Digite o incremento: ");
        int incremento = scanner.nextInt();

        if (incremento == 0) {
            System.out.println("O incremento não pode ser zero!");
        } else if (valor1 > valor2 && incremento > 0) {
            System.out.println("O valor inicial é maior que o final");
        } else {
            System.out.print("Contagem: ");

            if (valor1 < valor2) {
                for (int i = valor1; i < valor2; i += incremento) {
                    System.out.print(i + " ");
                }
            }
            System.out.println("Acabou!");
        }

    }
}

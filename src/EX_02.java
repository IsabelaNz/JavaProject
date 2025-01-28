import java.util.Scanner;

public class EX_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // Agora a variável nome recebe um valor

        System.out.println("Olá, " + nome + ", é um prazer te conhecer!");

        scanner.close();
        // teste
    }
}

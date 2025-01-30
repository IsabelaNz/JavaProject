import java.util.Scanner;

public class EX_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("QUal a quantidade de cigarros que você fuma por dia ?");
        int quantidadeCigarros = scanner.nextInt();

        System.out.println("Há quantos anos você fuma ?");
        int anos = scanner.nextInt();

        int reducaoEmMInutos = anos * 365 * quantidadeCigarros * 10;
        int reducaoEmDias = reducaoEmMInutos / (24 * 60);

        System.out.printf("A redução do tempo de vida em dias é: " + reducaoEmDias);
    }
}

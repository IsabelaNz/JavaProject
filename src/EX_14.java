import java.util.Scanner;

public class EX_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("== LOCADORA DE VEÍCULOS ==");

        System.out.print("Qual a quantidade de Km percorridos pelo carro? ");
        double quantidadeEmKm = scanner.nextDouble();

        System.out.print("Qual a quantidade de dias que o carro foi utilizado? ");
        int quantidadeEmDias = scanner.nextInt();

        int precoCarro = 90;
        double precoKm = 0.20;
        double totalAPagar = (quantidadeEmDias * precoCarro) + (quantidadeEmKm * precoKm);

        System.out.printf("O total a pagar será de R$ %.2f\n", totalAPagar);

        scanner.close();
    }
}

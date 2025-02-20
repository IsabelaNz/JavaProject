import java.util.Scanner;

public class EX_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de horas de atividade física no mês: ");
        int horas = scanner.nextInt();
        int pontos = 0;

        if (horas <= 10) {
            pontos = horas * 2;
        } else if (horas <= 20) {
            pontos = (10 * 2) + ((horas - 10) * 5);
        } else {
            pontos = (10 * 2) + (10 * 5) + ((horas - 20) * 10);
        }

        double dinheiro = pontos * 0.05;

        System.out.println("Total de pontos: " + pontos);
        System.out.printf("Valor ganho: R$ %.2f\n", dinheiro);

        scanner.close();
    }
}

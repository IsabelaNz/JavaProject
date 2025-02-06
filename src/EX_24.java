import java.util.Scanner;

public class EX_24 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a distância que você deseja percorrer em KM?");
        double distanciaEmKm = scanner.nextDouble();

        double tarifaParaMenorDistancia = 0.50;
        double tarifaParaMaiorDistancia = 0.45;

        if (distanciaEmKm <= 200) {
            double custoTotal = tarifaParaMenorDistancia * distanciaEmKm;
            System.out.printf("O valor a pagar será de R$ %.2f\n", custoTotal);
        } else {
            double custoTotal = tarifaParaMaiorDistancia * distanciaEmKm;
            System.out.printf("O valor a pagar será de R$ %.2f\n", custoTotal);
        }
    }
}

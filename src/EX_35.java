import java.util.Scanner;

public class EX_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ALUGUEL DE CARROS POPULARES E DE LUXO");

        String carro;

        while (true) {
            System.out.println("Qual carro você alugou? (popular ou luxo) ");
            carro = scanner.next();

            if (carro.equalsIgnoreCase("popular") || carro.equalsIgnoreCase("luxo")) {
                break;
            } else {
                System.out.println("Entrada inválida! Digite 'popular' ou 'luxo'");
            }
        }

        int precoDiariaCarroPopular = 90;
        int precoDiariaCarroLuxo = 150;
        double precoFinal = 0;

        System.out.println("Quantos dias foram usados o carro ?");
        int diasUsados= scanner.nextInt();

        System.out.println("Quantos KM foram percorridos ? ");
        double km = scanner.nextDouble();

        if (carro.equalsIgnoreCase("popular")) {
            double precoKm = (km <= 100) ? 0.20 : 0.10;
            precoFinal = (diasUsados * precoDiariaCarroPopular) + (km * precoKm);
        } else if (carro.equalsIgnoreCase("luxo")) {
            double precoKm = (km <= 200) ? 0.30 : 0.25;
            precoFinal = (diasUsados * precoDiariaCarroLuxo) + (km * precoKm);
        }

        System.out.printf("O valor total do aluguel é: R$ %.2f%n", precoFinal);
    }
}
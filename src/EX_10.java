import java.util.Scanner;

public class EX_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a largura da sua parede: ");
        double largura = scanner.nextDouble();

        System.out.println("Qual é a altura da sua parede: ");
        double altura = scanner.nextDouble();

        double metroQuadrado = altura * largura;

        double tinta = metroQuadrado / 2;

        System.out.printf("A área da parede é %.2f metros quadrados.\n", metroQuadrado);
        System.out.printf("Você precisará de aproximadamente %.2f litros de tinta.\n", tinta);

    }
}

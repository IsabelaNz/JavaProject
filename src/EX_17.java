import java.util.Scanner;

public class EX_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a velocidade do carro ? ");
        double velocidade = scanner.nextDouble();

        if (velocidade > 80) {
            double multa = (velocidade - 80) * 5;
            System.out.printf("Você foi multado, o valor da multa será de: R$ %.2f", multa);
        } else {
            System.out.println("Velocidade dentro do limite");
        }
    }
}

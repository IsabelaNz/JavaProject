import java.util.Scanner;

public class EX_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma distância em metros: ");
        double metros = scanner.nextDouble();

        double centimetros = metros * 100;
        System.out.println("A distância de " + metros + " metros corresponde a " + centimetros + " centímetros.");

        double quilometros = metros / 1000;
        System.out.println("A distância de " + metros + " metros corresponde a " + quilometros + " quilometros.");

        double hectometro = metros / 100;
        System.out.println("A distância de " + metros + " metros corresponde a " + hectometro + " hectometros.");

        double decametro = metros / 10;
        System.out.println("A distância de " + metros + " metros corresponde a " + decametro + " decametros.");

        double decimetro = metros * 10;
        System.out.println("A distância de " + metros + " metros corresponde a " + decimetro + " decimetros.");

        double milimetros = metros * 1000;
        System.out.println("A distância de " + metros + " metros corresponde a " + milimetros + " milimetros.");

        scanner.close();
    }
}

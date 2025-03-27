import java.util.Scanner;

public class EX_51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] precos = new double[8];

        for (int i = 0; i < precos.length; i ++) {
            System.out.println("Digite o preço do produto " + (i + 1) + ": ");
            precos[i] = scanner.nextDouble();
        }

        // Inicializando maior e menor preço com o primeiro valor do array
        double maior = precos[0];
        double menor = precos[0];

        for (int i = 1; i < precos.length; i++) {
            if (precos[i] > maior) {
                maior = precos[i];
            }
            if (precos[i] < menor){
                menor = precos[i];
            }
        }

        System.out.println("\nO maior preço digitado foi: R$ " + maior);
        System.out.println("O menor preço digitado foi: R$ " + menor);

    }
}

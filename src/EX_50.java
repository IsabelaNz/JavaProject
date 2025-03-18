import java.util.Random;

public class EX_50 {
    public static void main(String[] args) {
        Random random = new Random();

        int contador = 0;
        int divisiveis = 0;
        for (int i = 0; i < 20; i++) {
            int numeroAleatorio = random.nextInt(10); // Gera números de 0 a 9
            System.out.println("Número " + (i + 1) + ": " + numeroAleatorio);

            // Verificando se o número é maior que 5
            if (numeroAleatorio > 5) {
                contador++;
            }

            // Verificando se o número é divisível por 3
            if (numeroAleatorio % 3 == 0) {
                divisiveis++;
            }
        }

        System.out.println("Quantidade de números sorteados maiores que 5: " + contador);
        System.out.println("Quantidade de números sorteados divisíveis por 3: " + divisiveis);
    }
}

import java.util.Scanner;

public class EX_62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resposta;
        int idade = 0;
        int contador = 0;
        double somaIdades = 0;
        double media = 0;
        int idadeMaiorQueVinteEUm = 0;

        do {
            System.out.println("Digite a idade da pessoa: ");
            idade = scanner.nextInt();
            somaIdades += idade;
            contador++;

            System.out.println("Você deseja continuar adicionando idades ?(S/N)");
            resposta = scanner.next();

            if (idade >= 21) {
                idadeMaiorQueVinteEUm++;
            }

        } while (resposta.equalsIgnoreCase("S"));

        if (idade > 0) {
            media = somaIdades / contador;
            System.out.println("Média de idades: " + media);
        } else {
            System.out.println("Nenhuma idade foi digitada");
        }

        System.out.println("Quantidade de idades digitadas: " + contador);
        System.out.println("Quantidade de pessoas com mais de vinte e um anos: " + idadeMaiorQueVinteEUm);
    }
}

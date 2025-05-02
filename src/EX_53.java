import java.util.Scanner;

public class EX_53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] idade = new double[5];
        String[] sexo = new String[5];
        int qtdHomens = 0;
        int qtdMulheres = 0;
        double soma = 0;
        double media = 0;
        double somaIdadeHomens = 0;
        double mediaIdadeHomens = 0;
        int mulheresMaioresDeVinteAnos = 0;

        for (int i = 0; i < idade.length; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idade[i] = scanner.nextDouble();
            soma += idade[i];

            System.out.print("Digite o sexo da pessoa (M/F): ");
            sexo[i] = scanner.next();

            if (sexo[i].equalsIgnoreCase("M")) {
                qtdHomens++;
                somaIdadeHomens += idade[i];
            }

            if (sexo[i].equalsIgnoreCase("F")) {
                qtdMulheres++;
                if (idade[i] > 20) {
                    mulheresMaioresDeVinteAnos++;
                }
            }
        }

        media = soma / idade.length;
        if (qtdHomens > 0) {
            mediaIdadeHomens = somaIdadeHomens / qtdHomens;
        }

        System.out.println("\nQuantidade de homens: " + qtdHomens);
        System.out.println("Quantidade de mulheres: " + qtdMulheres);
        System.out.println("Média de idade geral: " + media);
        System.out.println("Média de idade dos homens: " + mediaIdadeHomens);
        System.out.println("Número de mulheres com mais de 20 anos: " + mulheresMaioresDeVinteAnos);
    }
}

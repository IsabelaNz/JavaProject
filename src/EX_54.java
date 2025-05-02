import java.util.Scanner;

public class EX_54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] peso = new double[7];
        double[] altura = new double[7];
        double mediaAltura = 0;
        double somaAltura = 0;
        int pesoMaiorQueNoventa = 0;
        int pessoasAbaixo50kgEMenos1_60m = 0;
        int pessoasAcima1_90mEAcima100kg = 0;

        for (int i = 0; i < peso.length; i++) {
            System.out.println("Digite o peso da pessoa " + (i + 1) + ": ");
            peso[i] = scanner.nextDouble();

            System.out.println("Digite a altura da pessoa " + (i + 1) + ": ");
            altura[i] = scanner.nextDouble();

            somaAltura += altura[i];

            if (peso[i] > 90) {
                pesoMaiorQueNoventa++;
            }

            if (peso[i] < 50 && altura[i] < 1.60) {
                pessoasAbaixo50kgEMenos1_60m++;
            }

            if (peso[i] > 90 && altura[i] > 1.90) {
                pessoasAcima1_90mEAcima100kg++;
            }
        }

        mediaAltura = somaAltura / altura.length;

        System.out.println("\nResultados:");
        System.out.println("Média da altura das pessoas: " + mediaAltura);
        System.out.println("Quantidade de pessoas com peso maior que 90kg: " + pesoMaiorQueNoventa);
        System.out.println("Quantidade de pessoas com peso abaixo de 50kg e altura abaixo de 1,60m: " + pessoasAbaixo50kgEMenos1_60m);
        System.out.println("Quantidade de pessoas com mais de 1,90m de altura e mais de 90kg de peso: " + pessoasAcima1_90mEAcima100kg);
    }
}

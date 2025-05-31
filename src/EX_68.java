import java.util.Scanner;

public class EX_68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sexo;
        double peso;
        int qtdMulheres = 0;
        int qtdHomensMaiorDe100Kg = 0;
        double somaPesoMulheres = 0;
        double mediaPesoMulheres;
        double maiorPesoHomens = 0;

        for (int i = 0; i < 9; i++) {
            System.out.print("Digite seu sexo (M ou F): ");
            sexo = scanner.nextLine().toUpperCase();

            if (!sexo.equals("M") && !sexo.equals("F")) {
                System.out.println("Sexo inválido. Tente novamente.");
                i--;
                continue;
            }

            System.out.print("Digite seu peso (kg): ");
            peso = scanner.nextDouble();
            scanner.nextLine();


            if (sexo.equalsIgnoreCase("F")) {
                somaPesoMulheres += peso;
                qtdMulheres++;
            } else { // sexo é M
                if (peso > 100) {
                    qtdHomensMaiorDe100Kg++;
                }
                if (peso > maiorPesoHomens) {
                    maiorPesoHomens = peso;
                }
            }
        }

        if (qtdMulheres > 0) {
            mediaPesoMulheres = somaPesoMulheres / qtdMulheres;
        } else {
            mediaPesoMulheres = 0;
        }

        System.out.println("Quantidade de mulheres: " + qtdMulheres);
        System.out.println("Quantidade de homens com mais de 100kg: " + qtdHomensMaiorDe100Kg);
        System.out.println("Média de peso entre mulheres: " + mediaPesoMulheres);
        System.out.println("Maior peso entre os homens: " + maiorPesoHomens);
    }
}

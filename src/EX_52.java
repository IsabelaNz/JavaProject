import java.util.Scanner;

public class EX_52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] idade = new double[10];
        int maioresDe18 = 0;
        int menoresDe5 = 0;
        double soma = 0;
        double maiorIdade = 0;

        for (int i = 0; i < idade.length; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idade[i] = scanner.nextDouble();
            soma += idade[i];

            if (idade[i] > 18) {
                maioresDe18++;
            }

            if (idade[i] < 5) {
                menoresDe5++;
            }

            if (idade[i] > maiorIdade) {
                maiorIdade = idade[i];
            }
        }

        double media = soma / idade.length;

        System.out.println("A média das idades é: " + media);
        System.out.println("Existem " + maioresDe18 + " pessoas com mais de 18 anos.");
        System.out.println("Existem " + menoresDe5 + " pessoas com menos de 5 anos.");
        System.out.println("A maior idade digitada foi: " + maiorIdade);
    }
}

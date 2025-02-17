import java.util.Scanner;

public class EX_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o valor da casa que será comprada ? ");
        double valorCasa = scanner.nextDouble();

        System.out.println("Qual é o seu salário ? ");
        double valorSalario = scanner.nextDouble();

        System.out.println("Em quantos anos você irá pagar a casa ? ");
        int quantidadeAnos = scanner.nextInt();

        double prestacaoMensal = valorCasa / (quantidadeAnos * 12);

        double limitePrestacao = valorSalario * 0.30;

        if (prestacaoMensal <= limitePrestacao) {
            System.out.println("Emprestimo aprovado! A prestação mensal será de: " + prestacaoMensal);
        } else {
            System.out.println("Empréstimo negado! A prestação mensal excede 30% do seu salário");
        }
    }
}
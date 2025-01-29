import java.util.Scanner;

public class EX_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do seu produto: ");
        double precoProduto = scanner.nextDouble();

        double porcentagem = 5;
        double desconto = (porcentagem / 100) * precoProduto;
        double valorComDesconto = precoProduto - desconto;

        System.out.printf("O preço do produto com 5%% de desconto é: R$ %.2f\n", valorComDesconto);

        scanner.close();
    }
}

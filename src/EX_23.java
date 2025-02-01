import java.util.Scanner;

public class EX_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu nome ?");
        String nome = scanner.next();

        String sexo;

        System.out.println("Digite o valor das suas compras: ");
        double valorCompras = scanner.nextDouble();

        double porcentagemFeminino = 13;

        double porcentagemMasculino = 5;


        while (true) {
            System.out.println("Qual é seu gênero (Masculino ou Feminino) ?");
            sexo = scanner.next();

            if (sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("feminino")) {
                break;
            } else {
                System.out.println("Entrada inválida! Digite 'Masculino' ou 'Feminino'.");
            }
        }

        if (sexo.equals("Feminino")) {
            double descontoFeminino = (porcentagemFeminino / 100) * valorCompras;
            double valorComDescontoFeminino = valorCompras - descontoFeminino;
            System.out.printf("O preço do produto com 13%% de desconto é: R$ %.2f\n", valorComDescontoFeminino);
        } else {
            double descontoMasculino = (porcentagemMasculino / 100) * valorCompras;
            double valorComDescontoMasculino = valorCompras - descontoMasculino;
            System.out.printf("O preço do produto com 5%% de desconto é: R$ %.2f\n", valorComDescontoMasculino);
        }
    }
}
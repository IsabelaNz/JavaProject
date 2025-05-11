import java.util.Scanner;

public class EX_59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = 0;
        String sexo;
        String resposta;
        int maiorIdade = 0;
        int qtdHomens = 0;
        Integer idadeMulherJovem = null;
        double somaIdadeHomens = 0;
        double mediaIdadeHomens = 0;

        do {
            System.out.println("Digite a idade da pessoa: ");
            idade = scanner.nextInt();

            System.out.println("Digite o sexo da pessoa: (M/F)");
            sexo = scanner.next();

            if (sexo.equalsIgnoreCase("F")) {
                if (idadeMulherJovem == null || idade < idadeMulherJovem){
                    idadeMulherJovem = idade;
                }
            } else if (sexo.equalsIgnoreCase("M")) {
                somaIdadeHomens += idade;
                qtdHomens++;
            } else {
                System.out.println("Sexo inválido");
            }

            System.out.println("Você deseja adicionar mais pessoas ?(S/N)");
            resposta = scanner.next();

            if (idade > maiorIdade){
                maiorIdade = idade;
            }

        } while (resposta.equalsIgnoreCase("S"));

        if (qtdHomens > 0) {
            mediaIdadeHomens = somaIdadeHomens / qtdHomens;
            System.out.println("Media da idade dos homens: " + mediaIdadeHomens);
        } else {
            System.out.println("Nenhum homem encontrado");
        }

        System.out.println("Maior idade lida: " + maiorIdade);
        System.out.println("Quantidade de homens: " + qtdHomens);

        if (idadeMulherJovem != null) {
            System.out.println("Idade da mulher mais jovem: " + idadeMulherJovem);
        } else {
            System.out.println("Nenhuma mulher foi cadastrada.");
        }
    }
}

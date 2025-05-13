import java.util.Scanner;

public class EX_60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome, sexo, resposta;
        int idade = 0;
        int maiorIdade = 0;
        String nomePessoaMaisVelha = "";
        String mulherMaisJovem = "";
        int idadeMulherMaisJovem = 0;
        boolean primeiraMulher = true;
        double somaIdades = 0;
        int qtdPessoas = 0;
        double mediaIdades = 0;
        int homensMaiorQueTrintaAnos = 0;
        int mulheresMenoresDezoitoAnos = 0;

        do {
            System.out.println("Digite o nome da pessoa: ");
            nome = scanner.next();

            System.out.println("Digite a idade da pessoa: ");
            idade = scanner.nextInt();

            System.out.println("Digite o sexo da pessoa: (M/F) ");
            sexo = scanner.next();

            System.out.println("Você quer continuar adicionando pessoas ? (S/N)");
            resposta = scanner.next();

            if (sexo.equalsIgnoreCase("M")) {
                somaIdades += idade;
                qtdPessoas++;
                if (idade > 30) {
                    homensMaiorQueTrintaAnos++;
                }
            } else if (sexo.equalsIgnoreCase("F")) {
                somaIdades += idade;
                qtdPessoas++;
                if (idade < 18) {
                    mulheresMenoresDezoitoAnos++;
                }

                if (primeiraMulher) {
                    idadeMulherMaisJovem = idade;
                    mulherMaisJovem = nome;
                    primeiraMulher = false;
                } else if (idade < idadeMulherMaisJovem) {
                    idadeMulherMaisJovem = idade;
                    mulherMaisJovem = nome;
                }
            } else {
                System.out.println("Sexo inválido");
            }

            if (idade > maiorIdade) {
                maiorIdade = idade;
                nomePessoaMaisVelha = nome;
            }

        } while (resposta.equalsIgnoreCase("S"));

        if (idade > 0) {
            mediaIdades = somaIdades / qtdPessoas;
            System.out.println("Média de idades: " + mediaIdades);
        } else {
            System.out.println("Nenhuma pessoa encontrada");
        }

        System.out.println("Pessoa mais velha: " + nomePessoaMaisVelha + " (" + maiorIdade + " anos)");

        if (!primeiraMulher) {
            System.out.println("Mulher mais jovem: " + mulherMaisJovem + " (" + idadeMulherMaisJovem + " anos)");
        } else {
            System.out.println("Nenhuma mulher foi cadastrada.");
        }

        System.out.println("Quantidade de homens maiores de 30 anos: " + homensMaiorQueTrintaAnos);
        System.out.println("Quantidade de mulheres menores de 18 anos: " + mulheresMenoresDezoitoAnos);
    }
}

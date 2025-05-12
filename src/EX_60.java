import java.util.Scanner;

public class EX_60 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String nome;
    String sexo;
    int idade = 0;
    String resposta;
    String nomePessoaMaisVelha;
    String mulherMaisJovem;
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
        } else {
            System.out.println("Sexo inválido");
        }
        
    } while (resposta.equalsIgnoreCase("S"));

        if (idade > 0) {
            mediaIdades = somaIdades/ qtdPessoas;
            System.out.println("Média de idades: " + mediaIdades);
        } else {
            System.out.println("Nenhuma pessoa encontrada");
        }

        System.out.println("Quantidade de homens maiores de 30 anos: " + homensMaiorQueTrintaAnos);
        System.out.println("Quantidade de mulheres menores de 18 anos: " + mulheresMenoresDezoitoAnos);
    }
}
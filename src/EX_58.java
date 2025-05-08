import java.util.Scanner;

public class EX_58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idadeAluno = 0;
        int qtdAlunos = 0;
        double mediaIdades = 0;
        int somaIdades = 0;

        while (true) {
            System.out.println("Digite a idade do aluno: ");
            idadeAluno = scanner.nextInt();

            if (idadeAluno == 999) {
                break;
            }
            somaIdades += idadeAluno;
            qtdAlunos++;
        }

        if (qtdAlunos > 0){
            mediaIdades = somaIdades / qtdAlunos;
            System.out.println("Quantidade de alunos: "+ qtdAlunos);
            System.out.println("Média das idades: " + mediaIdades);
        } else {
            System.out.println("Nenhum aluno registrado");
        }
    }
}
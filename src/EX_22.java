import java.time.LocalDate;
import java.util.Scanner;

public class EX_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano do seu nascimento: ");
        int anoNascimento = scanner.nextInt();

        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - anoNascimento;
        int idadeAlistamento = 18;

        if (idade < idadeAlistamento) {
            int anosFaltam = idadeAlistamento - idade;
            System.out.println("Você ainda não precisa se alistar. Faltam " + anosFaltam + " anos.");
        } else if (idade == idadeAlistamento) {
            System.out.println("Você deve se alistar este ano!");
        } else {
            int anosPassaram = idade - idadeAlistamento;
            System.out.println("Já passaram " + anosPassaram + " anos do seu alistamento.");
        }

        scanner.close();
    }
}

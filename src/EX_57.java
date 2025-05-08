import java.util.Scanner;

public class EX_57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario;
        String sexo;
        double somaMulheres = 0;
        double somaHomens = 0;
        String resposta;

        do {
            System.out.println("Digite o salário do funcionário(a): ");
            salario = scanner.nextDouble();

            if (salario < 0) {
                System.out.println("Salário negativo detectado. Encerrando o programa.");
                break;
            }

            System.out.println("Digite o sexo do funcionário(a) (F/M): ");
            sexo = scanner.next();

            if (sexo.equalsIgnoreCase("F")) {
                somaMulheres += salario;
            } else if (sexo.equalsIgnoreCase("M")) {
                somaHomens += salario;
            } else {
                System.out.println("Sexo inválido. Dados não computados.");
            }

            System.out.print("Deseja adicionar outro funcionário? (S/N): ");
            resposta = scanner.next();

        } while (resposta.equalsIgnoreCase("S"));

        System.out.println("Soma dos salários das funcionárias (mulheres): R$ " + somaMulheres);
        System.out.println("Soma dos salários dos funcionários (homens): R$ " + somaHomens);

        scanner.close();
    }
}

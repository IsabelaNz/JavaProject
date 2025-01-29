import java.util.Scanner;

public class EX_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos dias você trabalhou no mês ?");
        int diasTrabalhados = scanner.nextInt();

        int horasPorDia = 8;
        int salarioPorHora = 25;

        double salarioDoFuncionario = (horasPorDia * salarioPorHora) * diasTrabalhados;

        System.out.printf("O salário do funcionário será de R$ %.2f \n", salarioDoFuncionario);
    }
}

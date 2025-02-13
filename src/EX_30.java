import java.util.Scanner;

public class EX_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma reta A: ");
        double retaA = scanner.nextDouble();

        System.out.println("Digite uma reta B: ");
        double retaB = scanner.nextDouble();

        System.out.println("Digite uma reta C: ");
        double retaC = scanner.nextDouble();

        if (retaA == 0 || retaB == 0 || retaC == 0) {
            System.out.println("Uma reta não pode ser igual a zero");
        } else if (retaA + retaB < retaC || retaA + retaC < retaB || retaB + retaC < retaA) {
            System.out.println("A soma de uma reta não pode ser menor que duas retas");
        } else {
            System.out.println("Essa condição pode ser um triângulo");
        }

        if (retaA == retaB && retaA == retaC && retaC == retaB) {
            System.out.println("O triângulo é equilátero");
        } else if(retaA != retaB && retaA != retaC && retaC != retaB) {
            System.out.println("O triângulo é escaleno");
        } else {
            System.out.println("O triângulo é isóceles");
        }
    }
}
import java.util.Scanner;

public class EX_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual ano você nasceu ?");
        int ano = scanner.nextInt();

        int idade = 2024 - ano;

        if (idade < 18) {
            System.out.println("Você não pode votar");
        } else {
            System.out.println("Você pode votar");
        }


    }
}

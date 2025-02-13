import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EX_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opcoes = {"pedra", "papel", "tesoura"};

        System.out.println("Escolha: pedra, papel, tesoura");

        String usuario = scanner.nextLine();
        String computador = opcoes[random.nextInt(3)];

        System.out.println("O computador escolheu: " + computador);

        if (usuario.equals(computador)) {
            System.out.println("Empate! Ambos escolheram " + computador + ".");
        }
        // Condições de vitória do usuário
        else if (usuario.equals("pedra") && computador.equals("tesoura")) {
            System.out.println("Você venceu! Pedra quebra Tesoura.");
        } else if (usuario.equals("papel") && computador.equals("pedra")) {
            System.out.println("Você venceu! Papel cobre Pedra.");
        } else if (usuario.equals("tesoura") && computador.equals("papel")) {
            System.out.println("Você venceu! Tesoura corta Papel.");
        }
        // Condições de derrota do usuário
        else if (usuario.equals("pedra") && computador.equals("papel")) {
            System.out.println("Você perdeu! Papel cobre Pedra.");
        } else if (usuario.equals("papel") && computador.equals("tesoura")) {
            System.out.println("Você perdeu! Tesoura corta Papel.");
        } else if (usuario.equals("tesoura") && computador.equals("pedra")) {
            System.out.println("Você perdeu! Pedra quebra Tesoura.");
        }
    }
}
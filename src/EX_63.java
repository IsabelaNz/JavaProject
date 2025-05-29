import java.util.Scanner;

public class EX_63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menorValor = 0;
        double media = 0;
        int par = 0;
        int soma = 0;
        int numero;
        int contador = 0;
        String resposta;
        int qtdPares = 0;
        boolean primeiroNumero = true;

        do {
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
            soma += numero;
            contador ++;

            System.out.println("Você deseja adicionar mais números ? (S/N)");
            resposta = scanner.next();

            if (primeiroNumero) {
                menorValor = numero;
                primeiroNumero = false;
            } else if (numero < menorValor) {
                menorValor = numero;
            }

            if (numero % 2 == 0) {
                qtdPares++;
            }

        } while (resposta.equalsIgnoreCase("S"));

        if (contador > 0) {
            media = soma / contador;
            System.out.println("A média de números é: " + media);
        } else{
            System.out.println("Nenhum número foi digitado");
        }

        System.out.println("A soma dos valores é: " + soma);
        System.out.println("O menor valor é: " + menorValor);
        System.out.println("Quantidade de números pares: " + qtdPares);
    }

}
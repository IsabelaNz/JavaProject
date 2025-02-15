Exercícios de 1 ao 100 do Guanabara
https://www.cursoemvideo.com/wp-content/uploads/2020/10/Exerci%CC%81cios-de-Algoritmos-1-100.pdf

import java.util.Scanner;

public class EX_34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a sua altura ? ");
        double altura = scanner.nextDouble();

        System.out.println("Qual é o seu peso ? ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 25 ) {
            System.out.println("Peso ideal");
        } else if (imc >= 25 && imc <= 30) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc <= 40) {
            System.out.println("Obesidade");
        } else {
            System.out.println("Obesidade mórbida");
        }

        scanner.close();
    }
}

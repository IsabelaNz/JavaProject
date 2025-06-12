public class EX_70 {
    public static void main(String[] args) {
        int termo1 = 1;
        int termo2 = 1;

        System.out.println("Os 10 primeiros termos da sequência de Fibonacci são:");

        System.out.print(termo1 + " " + termo2 + " ");

        for (int i = 3; i <= 10; i++) {
            int proximoTermo = termo1 + termo2;
            System.out.print(proximoTermo + " ");
            termo1 = termo2;
            termo2 = proximoTermo;
        }
    }
}

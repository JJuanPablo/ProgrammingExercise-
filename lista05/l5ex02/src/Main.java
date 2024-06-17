import java.util.Scanner;

public class Main {

    public static int calcularFatorial(int N) {
        if (N == 0) {
            return 1;
        }
        return N * calcularFatorial(N - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        int resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);

    }
}

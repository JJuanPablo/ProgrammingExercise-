import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        int inicio, fim;
        if (numero1 < numero2) {
            inicio = numero1;
            fim = numero2;
        } else {
            inicio = numero2;
            fim = numero1;
        }

        System.out.println("Números entre " + inicio + " e " + fim + ":");
        for (int i = inicio + 1; i < fim; i++) {
            System.out.println(i);
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("Digite o primeiro número inteiro:");
        numero1 = in.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        numero2 = in.nextInt();

        if (numero1 > numero2) {
            System.out.println("O primeiro número (" + numero1 + ") é maior que o segundo número (" + numero2 + ").");
        } else if (numero2 > numero1) {
            System.out.println("O segundo número (" + numero2 + ") é maior que o primeiro número (" + numero1 + ").");
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}

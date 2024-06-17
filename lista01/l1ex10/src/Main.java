import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double milhas, quilometros;

        System.out.println("Digite a medida em milhas:");
        milhas = in.nextDouble();

        quilometros = milhas * 1.60934;

        System.out.println("A medida em quilômetros é: " + quilometros);
    }
}

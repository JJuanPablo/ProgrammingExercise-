import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double quilometros, milhas;

        System.out.println("Digite a medida em quilômetros:");
        quilometros = in.nextDouble();

        milhas = quilometros * 0.621371;

        System.out.println("A medida em milhas é: " + milhas);
    }
}
